package co.simplon.p25.api.validators;

import co.simplon.p25.api.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueUserValidator implements
	ConstraintValidator<UniqueUserConstraint, String> {

    private final UserRepository UserRepo;

    public UniqueUserValidator(UserRepository UserRepo) {
	this.UserRepo = UserRepo;
    }

    @Override
    public boolean isValid(String username,
	    ConstraintValidatorContext context) {
	return (username != null) && !UserRepo
		.findByUsernameIgnoreCase(username)
		.isPresent();

    }
}
