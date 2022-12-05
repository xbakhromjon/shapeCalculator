package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.shapes.base.ThreeDimensionalShape;
import uz.xbakhromjon.shapeCalculator.shapes.base.TwoDimensionalShape;

@Setter
@Getter
@AllArgsConstructor
public class Cube implements ThreeDimensionalShape, TwoDimensionalShape {
    private Double side;

    @Override
    public Double getArea() {
        return 6 * side * side;
    }

    @Override
    public Double getPerimeter() {
        return 12 * side;
    }


    @Override
    public Double getVolume() {
        return Math.pow(side, 3);
    }
}
