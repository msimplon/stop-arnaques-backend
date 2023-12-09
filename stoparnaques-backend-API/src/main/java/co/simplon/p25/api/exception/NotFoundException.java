package co.simplon.p25.api.exception;

import org.springframework.security.authentication.BadCredentialsException;

@SuppressWarnings("serial")
public final class NotFoundException
	extends BadCredentialsException {

    public NotFoundException(String message) {
	super(message);
    }
}