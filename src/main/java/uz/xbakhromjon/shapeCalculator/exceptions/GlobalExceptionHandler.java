package uz.xbakhromjon.shapeCalculator.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import uz.xbakhromjon.shapeCalculator.response.ErrorResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e, ServletWebRequest webRequest) {
        return new ResponseEntity<>(
                new ErrorResponse(
                        e.getClass().getSimpleName(),
                        webRequest.getRequest().getRequestURI(),
                        e.getBody().getDetail(),
                        e.getDetailMessageArguments()
                ),
                HttpStatus.BAD_REQUEST
        );
    }
}
