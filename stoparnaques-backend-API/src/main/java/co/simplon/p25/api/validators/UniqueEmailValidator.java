//package co.simplon.p25.api.validators;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import co.simplon.p25.api.services.CustomerService;
//
//public class UniqueEmailValidator implements
//	ConstraintValidator<UniqueEmail, String> {
//
//    private final CustomerService service;
//
//    public UniqueEmailValidator(CustomerService service) {
//	this.service = service;
//    }
//
//    @Override
//    public boolean isValid(String email,
//	    ConstraintValidatorContext context) {
//	if (email != null) {
//	    return !this.service.emailValueExists(email);
//	}
//	return true;
//
//    }
//};
