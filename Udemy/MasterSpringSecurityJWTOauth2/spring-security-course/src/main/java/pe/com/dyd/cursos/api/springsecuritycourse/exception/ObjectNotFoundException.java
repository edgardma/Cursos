package pe.com.dyd.cursos.api.springsecuritycourse.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException() {
    }
}
