package co.simplon.p25.api.exception;

@SuppressWarnings("serial")
public final class ForbiddenException
	extends RuntimeException {

    public ForbiddenException(String message) {
	super(message);
    }
}