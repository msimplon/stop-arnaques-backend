//package co.simplon.p25.api.validators;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import co.simplon.p25.api.services.CustomerService;
//
//public class UniqueCustomerNameValidator implements
//	ConstraintValidator<UniqueCustomerName, String> {
//
//    private final CustomerService service;
//
//    public UniqueCustomerNameValidator(
//	    CustomerService service) {
//	this.service = service;
//    }
//
//    @Override
//    public boolean isValid(String customerName,
//	    ConstraintValidatorContext context) {
//	if (customerName != null) {
//	    return !this.service
//		    .customerNameValueExist(customerName);
//	}
//	return true;
//    }
//
//}