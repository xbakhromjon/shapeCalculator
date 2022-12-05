package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.shapes.base.TwoDimensionalShape;

@Setter
@Getter
@AllArgsConstructor
public class Square implements TwoDimensionalShape {
    private Double side;

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public Double getPerimeter() {
        return 4 * side;
    }
}
