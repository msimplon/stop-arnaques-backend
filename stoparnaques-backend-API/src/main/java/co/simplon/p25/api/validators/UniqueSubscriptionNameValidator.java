//package co.simplon.p25.api.validators;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import co.simplon.p25.api.services.SubscriptionService;
//
//public class UniqueSubscriptionNameValidator implements
//	ConstraintValidator<UniqueSubscriptionName, String> {
//
//    private final SubscriptionService service;
//
//    public UniqueSubscriptionNameValidator(
//	    SubscriptionService service) {
//	this.service = service;
//    }
//
//    @Override
//    public boolean isValid(String subscriptionName,
//	    ConstraintValidatorContext context) {
//	if (subscriptionName != null) {
//	    return !this.service.subscriptionNameValueExist(
//		    subscriptionName);
//	}
//	return true;
//    }
//
//}
