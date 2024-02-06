package co.simplon.p25.api.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import com.auth0.jwt.interfaces.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = ImageTypeValidator.class)
public @interface ImageType {

    String message() default "Image type is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}