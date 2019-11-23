package springblack.common.exceptions;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomRestControllerAdvice {

    @ExceptionHandler(RecordAlreadyExistsException.class)
    public ResponseEntity<?> handleAlreadyExists(RecordAlreadyExistsException ex) {

        return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body("{\"message\": " + "\"" + ex.getMessage() + "\"}");

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleConstraintViolation(MethodArgumentNotValidException ex) {

        Map<String, Object> body = new HashMap<>();

        body.put("result", false);

        Map<String, String> errors = new HashMap<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {

            errors.put(error.getField(), error.getDefaultMessage());

        }

        body.put("field_errors", errors);

        return ResponseEntity.badRequest().body(body);

    }

}
