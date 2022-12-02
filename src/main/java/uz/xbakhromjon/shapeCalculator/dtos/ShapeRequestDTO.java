package uz.xbakhromjon.shapeCalculator.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShapeRequestDTO {
    private String shapeCode;
    // circle
    private Double radius;

    // rectangle
    private Double width;
    private Double height;

    // square, cube
    private Double side;

    // triangle
    private Double a;
    private Double b;
    private Double c;

    // parallelepiped
    // width, height above.
    private Double length;
}
