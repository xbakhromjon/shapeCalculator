package uz.xbakhromjon.shapeCalculator.shapes;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.constants.ValidationMessages;

@Setter
@Getter
@AllArgsConstructor
public class Square implements Base2DShape {
    @NotNull(message = ValidationMessages.SIDE_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.SIDE_MIN_VALUE_VIOLATION)
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
