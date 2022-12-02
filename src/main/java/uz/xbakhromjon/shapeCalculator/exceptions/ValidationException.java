package uz.xbakhromjon.shapeCalculator.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
public class ValidationException extends RuntimeException {
    private String message;
    private HttpStatus status;

    public ValidationException(String message) {
        this.message = message;
        status = HttpStatus.BAD_REQUEST;
    }
}
