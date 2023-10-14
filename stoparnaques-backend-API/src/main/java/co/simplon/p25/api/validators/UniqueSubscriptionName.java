package co.simplon.p25.api.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = UniqueSubscriptionNameValidator.class)
public @interface UniqueSubscriptionName {

    String message() default "This subscription name already exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
