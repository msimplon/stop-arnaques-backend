package co.simplon.p25.api.security;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;

public class JwtProvider {

    private final String issuer;
    private final long expriration;

    private final ZoneId zoneId;

    private final Algorithm algorithm;

    JwtProvider(String issuer, long expiration,
	    String zoneId, Algorithm algorithm) {
	this.issuer = issuer;
	this.expriration = expiration;
	this.zoneId = ZoneId.of(zoneId);
	this.algorithm = algorithm;
    }

    public Jwt create(String subject, List<String> roles) {
	LocalDateTime now = LocalDateTime.now(zoneId);
	Date issuedAt = toJavaUtilDate(now);
	LocalDateTime expires = now
		.plusSeconds(this.expriration);
	Date expiresAt = toJavaUtilDate(expires);
	Builder builder = JWT.create().withIssuer(issuer)
		.withIssuedAt(issuedAt)
		.withExpiresAt(expiresAt)
		.withSubject(subject);
	if ((roles != null) && !roles.isEmpty()) {
	    builder.withClaim("roles", roles);
	}

	String token = builder.sign(algorithm);
	return new Jwt(token);
    }

    private Date toJavaUtilDate(LocalDateTime now) {
	return Date.from(now.atZone(zoneId).toInstant());
    }
}
