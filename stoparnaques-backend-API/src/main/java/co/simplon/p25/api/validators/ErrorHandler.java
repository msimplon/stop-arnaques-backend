package co.simplon.p25.api.validators;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice // ca veux dire quoi ?
public class ErrorHandler
	extends ResponseEntityExceptionHandler { // ca eut dire qu'on a une autre calss qui s'appelera responseEntityHandler

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
	    MethodArgumentNotValidException ex,
	    HttpHeaders headers, HttpStatus status,
	    WebRequest request) {
	System.out.println("handleMethodArgumentNotValid");
	List<FieldError> errors = ex.getFieldErrors();
	List<CustomError> customErrors = new ArrayList<>(); //
	for (FieldError error : errors) {
	    String password = error.getCode();
	    String username = error.getField();
	    CustomError customError = new CustomError(
		    password, username);
	    customErrors.add(customError);
	}
	return handleExceptionInternal(ex, customErrors,
		headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
	    Exception ex, Object body, HttpHeaders headers,
	    HttpStatus status, WebRequest request) {

	return super.handleExceptionInternal(ex, body,
		headers, status, request);
    }

}
