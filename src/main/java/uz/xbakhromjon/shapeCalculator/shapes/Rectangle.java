package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class Rectangle implements BaseShape {
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
