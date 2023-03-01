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
public class Parallelepiped implements Base3DShape {
    @NotNull(message = ValidationMessages.WIDTH_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.WIDTH_MIN_VALUE_VIOLATION)
    private Double width;

    @NotNull(message = ValidationMessages.HEIGHT_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.HEIGHT_MIN_VALUE_VIOLATION)
    private Double height;

    @NotNull(message = ValidationMessages.LENGTH_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.LENGTH_MIN_VALUE_VIOLATION)
    private Double length;

    @Override
    public Double getArea() {
        return 2 * (width * height + width * length + height * length);
    }

    @Override
    public Double getPerimeter() {
        return 4 * (width + height + length);
    }


    @Override
    public Double getVolume() {
        return width * height * length;
    }
}
