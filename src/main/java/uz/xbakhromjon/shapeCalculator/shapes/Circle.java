package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.shapes.base.TwoDimensionalShape;

@Setter
@Getter
@AllArgsConstructor
public class Circle implements TwoDimensionalShape {
    private Double radius;

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
