package springblack.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class PermissionDeniedException extends RuntimeException {

    public PermissionDeniedException() {

        super();

    }

    public PermissionDeniedException(String message, Throwable cause) {

        super(message, cause);

    }

    public PermissionDeniedException(String message) {

        super(message);

    }

    public PermissionDeniedException(Throwable cause) {

        super(cause);

    }

}
