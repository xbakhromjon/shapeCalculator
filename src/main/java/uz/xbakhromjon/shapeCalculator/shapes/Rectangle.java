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
public class Rectangle implements Base2DShape {
    @NotNull(message = ValidationMessages.WIDTH_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.WIDTH_MIN_VALUE_VIOLATION)
    private Double width;

    @NotNull(message = ValidationMessages.HEIGHT_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.HEIGHT_MIN_VALUE_VIOLATION)
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
