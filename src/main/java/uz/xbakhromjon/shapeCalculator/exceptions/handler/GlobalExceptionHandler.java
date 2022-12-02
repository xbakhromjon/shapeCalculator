package uz.xbakhromjon.shapeCalculator.exceptions.handler;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import uz.xbakhromjon.shapeCalculator.exceptions.UniversalException;
import uz.xbakhromjon.shapeCalculator.exceptions.ValidationException;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UniversalException.class)
    public ResponseEntity<?> UniversalExceptionHandler(UniversalException exception, WebRequest webRequest) {
        return new ResponseEntity<>(exception.getMessage(), exception.getStatus());
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<?> ValidationExceptionHandler(ValidationException exception, WebRequest webRequest) {
        return new ResponseEntity<>(exception.getMessage(), exception.getStatus());
    }


}
