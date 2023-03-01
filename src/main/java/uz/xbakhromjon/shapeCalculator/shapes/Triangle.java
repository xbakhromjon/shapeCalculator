package uz.xbakhromjon.shapeCalculator.shapes;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.xbakhromjon.shapeCalculator.constants.ValidationMessages;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class Triangle implements Base2DShape {
    @NotNull(message = ValidationMessages.SIDE_A_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.SIDE_A_MIN_VALUE_VIOLATION)
    private Double sideA;

    @NotNull(message = ValidationMessages.SIDE_B_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.SIDE_B_MIN_VALUE_VIOLATION)
    private Double sideB;

    @NotNull(message = ValidationMessages.SIDE_C_CANNOT_NULL)
    @Min(value = 0, message = ValidationMessages.SIDE_C_MIN_VALUE_VIOLATION)
    private Double sideC;

    @Override
    public Double getArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * sideA * sideB * sideC);
    }

    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
