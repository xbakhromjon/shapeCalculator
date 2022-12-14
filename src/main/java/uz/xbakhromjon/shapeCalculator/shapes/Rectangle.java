package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Rectangle implements Base2DShape {
    private Double width;
    private Double height;

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (width + height);
    }
}
