package springblack.common.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Record already exists.")
public class RecordAlreadyExistsException extends RuntimeException {

    private static final long serialVersion = 1L;

    private final Boolean result = false;
    private final String  message;

    public RecordAlreadyExistsException(final String message) {

        this.message = message;

    }

}
