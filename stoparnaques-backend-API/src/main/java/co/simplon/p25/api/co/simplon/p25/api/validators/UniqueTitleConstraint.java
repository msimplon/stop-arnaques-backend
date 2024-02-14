package co.simplon.p25.api.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.auth0.jwt.interfaces.Payload;

import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotNull;

@Constraint(validatedBy = UniqueTitleValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
@Documented
@NotNull
public @interface UniqueTitleConstraint {
    String message() default "Cette titre existe déjà poto";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
