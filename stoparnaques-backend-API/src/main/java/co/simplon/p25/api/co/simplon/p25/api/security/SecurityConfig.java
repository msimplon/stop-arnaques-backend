package co.simplon.p25.api.security;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.auth0.jwt.algorithms.Algorithm;

@Configuration
public class SecurityConfig implements WebMvcConfigurer {
    @Value("${stoparnaques.security.jwt.issuer}")
    private String issuer;
    @Value("${stoparnaques.security.jwt.expiration}")
    private long expiration;
    @Value("${stoparnaques.security.jwt.zoneId}")
    private String zoneId;
    @Value("${stoparnaques.security.jwt.secret}")
    private String secret;

    @Value("${stoparnaques.cors.allowedOrigins}")
    private String[] allowedOrigins;

    @Value("${stoparnaques.cors.allowed-methods}")
    private String[] allowedMethods;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http)
	    throws Exception {
	http.cors(Customizer.withDefaults())
		.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests((authz) -> {
		    authz.requestMatchers(HttpMethod.POST,
			    "/users", "/users/sign-in",
			    "/articles").permitAll()
			    .requestMatchers(HttpMethod.GET,
				    "/articles/articleLastAdded",
				    "/categories",
				    "/articles/{id}/detail",
				    "/roles", "/disputes",
				    "/articles/list-articles",
				    "forms/list-forms")
			    .permitAll()
			    .requestMatchers(
				    HttpMethod.POST,
				    "articles/byId/{id}",
				    "/forms", "/send-mail")
			    .hasAuthority("admin")
			    .requestMatchers(
				    HttpMethod.DELETE,
				    "articles/byId/{id}")
			    .hasAuthority("admin")
			    .requestMatchers(
				    HttpMethod.PATCH,
				    "articles/byId/{id}")
			    .hasAuthority("admin")
			    .anyRequest().authenticated();
		}

		).oauth2ResourceServer((oauth2) -> oauth2
			.jwt(Customizer.withDefaults()));
	;
	return http.build();

    }

    @Bean
    public JwtDecoder jwtDecoder() {
	SecretKey secretKey = new SecretKeySpec(
		secret.getBytes(), "HMACSHA256");
	return NimbusJwtDecoder.withSecretKey(secretKey)
		.macAlgorithm(MacAlgorithm.HS256).build();
    }

    @Bean
    public JwtAuthenticationConverter jwtAuthenticationConverter() {
	JwtGrantedAuthoritiesConverter authoritiesConverter = new JwtGrantedAuthoritiesConverter();
	authoritiesConverter
		.setAuthoritiesClaimName("roles");
	authoritiesConverter.setAuthorityPrefix("");
	JwtAuthenticationConverter authenticationConverter = new JwtAuthenticationConverter();
	authenticationConverter
		.setJwtGrantedAuthoritiesConverter(
			authoritiesConverter);
	return authenticationConverter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtProvider jwtProvider() {
	Algorithm algorithm = Algorithm.HMAC256(secret);
	return new JwtProvider(issuer, expiration, zoneId,
		algorithm);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
		.allowedOrigins(allowedOrigins)
		.allowedMethods("POST", "GET", "PUT",
			"PATCH", "DELETE");
    }

}