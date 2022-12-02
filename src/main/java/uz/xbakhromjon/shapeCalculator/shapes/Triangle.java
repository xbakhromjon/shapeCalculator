package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class Triangle implements Base2DShape {
    private Double a;
    private Double b;
    private Double c;

    // BigDecimal correct choice in subtraction
    @Override
    public Double getArea() {
        double semiPerimeter = (a + b + c) / 2;
        BigDecimal bSemiPerimeter = new BigDecimal(semiPerimeter + "");
        return Math.sqrt(semiPerimeter *
                (bSemiPerimeter.subtract(new BigDecimal(a + ""))).doubleValue() *
                (bSemiPerimeter.subtract(new BigDecimal(b + ""))).doubleValue() *
                (bSemiPerimeter.subtract(new BigDecimal(c + ""))).doubleValue());
    }

    @Override
    public Double getPerimeter() {
        return a + b + c;
    }
}
