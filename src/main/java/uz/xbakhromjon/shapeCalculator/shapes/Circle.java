package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Circle implements BaseShape {
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
