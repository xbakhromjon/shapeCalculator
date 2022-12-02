package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Square implements BaseShape {
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
