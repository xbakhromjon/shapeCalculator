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
public class TriangleRequestDTO {
    private Double a;
    private Double b;
    private Double c;
}
