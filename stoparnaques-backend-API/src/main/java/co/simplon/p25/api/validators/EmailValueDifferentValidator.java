//package co.simplon.p25.api.validators;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class EmailValueDifferentValidator implements
//	ConstraintValidator<EmailValueDifferent, CreateCustomerDto> {
//
//    @Override
//    public boolean isValid(CreateCustomerDto inputs,
//	    ConstraintValidatorContext context) {
//	String fieldValue = inputs.getContactEmail();
//	String fieldMatchValue = inputs.getFromReplyTo();
//
//	if (fieldValue != null) {
//	    return !fieldValue.equals(fieldMatchValue);
//	} else {
//	    return fieldMatchValue == null;
//	}
//    }
//
//}