package uz.xbakhromjon.shapeCalculator.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
public class UniversalException extends RuntimeException {
    private String message;
    private HttpStatus status;

    public UniversalException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
