package uz.xbakhromjon.shapeCalculator.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String error;

    private String path;

    private String message;

    private Object data;
}
