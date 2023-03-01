package uz.xbakhromjon.shapeCalculator.shapes;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.constants.ValidationMessages;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Circle implements Base2DShape {
    @NotNull(message = ValidationMessages.RADIUS_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.RADIUS_MIN_VALUE_VIOLATION)
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
