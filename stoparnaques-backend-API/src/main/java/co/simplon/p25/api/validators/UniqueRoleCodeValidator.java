package co.simplon.p25.api.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.simplon.p25.api.services.ContactRoleService;

public class UniqueRoleCodeValidator implements
	ConstraintValidator<UniqueRoleCode, String> {

    private final ContactRoleService service;

    public UniqueRoleCodeValidator(
	    ContactRoleService service) {

	this.service = service;
    }

    @Override
    public boolean isValid(String roleCode,
	    ConstraintValidatorContext context) {
	if (roleCode != null) {
	    return !this.service
		    .roleCodeValueExists(roleCode);
	}
	return true;
    }
}
