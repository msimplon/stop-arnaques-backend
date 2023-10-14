package co.simplon.p25.api.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.simplon.p25.api.services.ContactRoleService;

public class UniqueContactRoleNameValidator implements
	ConstraintValidator<UniqueContactRoleName, String> {

    private final ContactRoleService service;

    public UniqueContactRoleNameValidator(
	    ContactRoleService service) {
	this.service = service;
    }

    @Override
    public boolean isValid(String contactRoleName,
	    ConstraintValidatorContext context) {
	if (contactRoleName != null) {
	    return !this.service.contactRoleNameValueExists(
		    contactRoleName);
	}
	return true;

    }

}
