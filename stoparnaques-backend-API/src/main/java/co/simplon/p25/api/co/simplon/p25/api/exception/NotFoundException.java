package co.simplon.p25.api.exception;

@SuppressWarnings("serial")
public final class NotFoundException
	extends RuntimeException {

    public NotFoundException(String message) {
	super("page non trouvée : " + message);
    }
}