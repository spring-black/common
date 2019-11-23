package springblack.common.exceptions;

import lombok.Getter;

@Getter
public class ValidationException extends RuntimeException {

    private static final long serialVersion = 1L;

    private final String message;

    public ValidationException(final String message) {

        this.message = message;

    }

}
