package co.simplon.p25.api.validators;

import co.simplon.p25.api.repositories.ArticleRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueTitleValidator implements
	ConstraintValidator<UniqueTitleConstraint, String> {

    private final ArticleRepository ArticleRepo;

    public UniqueTitleValidator(
	    ArticleRepository ArticleRepo) {
	this.ArticleRepo = ArticleRepo;
    }

    @Override
    public boolean isValid(String title,
	    ConstraintValidatorContext context) {
	return (title != null) && !ArticleRepo
		.findByTitleIgnoreCase(title).isPresent();
    }
}
