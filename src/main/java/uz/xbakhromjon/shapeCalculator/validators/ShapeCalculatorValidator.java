package uz.xbakhromjon.shapeCalculator.validators;

import org.springframework.stereotype.Component;
import uz.xbakhromjon.shapeCalculator.dtos.ShapeRequestDTO;
import uz.xbakhromjon.shapeCalculator.enums.EShape;
import uz.xbakhromjon.shapeCalculator.exceptions.ValidationException;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class ShapeCalculatorValidator {

    public void validate(ShapeRequestDTO requestDTO) {
        if (requestDTO == null) {
            throw new ValidationException("RequestBody cannot be null");
        }
        if (requestDTO.getShapeCode().equals(EShape.CIRCLE.name())) {
            checkFieldsForCircle(requestDTO);
        } else if (requestDTO.getShapeCode().equals(EShape.SQUARE.name())) {
            checkFieldsForSquare(requestDTO);
        } else if (requestDTO.getShapeCode().equals(EShape.RECTANGLE.name())) {
            checkFieldsForRectangle(requestDTO);
        } else if (requestDTO.getShapeCode().equals(EShape.TRIANGLE.name())) {
            checkFieldsForTriangle(requestDTO);
        } else {
            throw new ValidationException("Shape not acceptable");
        }
    }

    private void checkFieldsForTriangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getA() == null) {
            throw new ValidationException("a required for Triangle");
        }
        if (requestDTO.getB() == null) {
            throw new ValidationException("b required for Triangle");
        }
        if (requestDTO.getC() == null) {
            throw new ValidationException("c required for Triangle");
        }
        if (requestDTO.getA() <= 0) {
            throw new ValidationException("a cannot be negative or zero for Triangle");
        }
        if (requestDTO.getB() <= 0) {
            throw new ValidationException("b cannot be negative or zero for Triangle");
        }
        if (requestDTO.getC() <= 0) {
            throw new ValidationException("c cannot be negative or zero for Triangle");
        }

        checkTriangleCorrect(requestDTO);
    }

    private void checkTriangleCorrect(ShapeRequestDTO requestDTO) {
        double a = requestDTO.getA();
        double b = requestDTO.getB();
        double c = requestDTO.getC();

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new ValidationException("Triangle cannot exists these sides");
        }
    }

    private void checkFieldsForRectangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getWidth() == null) {
            throw new ValidationException("width required for Rectangle");
        }
        if (requestDTO.getHeight() == null) {
            throw new ValidationException("height required for Rectangle");
        }
        if (requestDTO.getWidth() <= 0) {
            throw new ValidationException("width cannot be negative or zero for Rectangle");
        }
        if (requestDTO.getHeight() <= 0) {
            throw new ValidationException("height cannot be negative or zero for Rectangle");
        }
    }

    private void checkFieldsForSquare(ShapeRequestDTO requestDTO) {
        if (requestDTO.getSide() == null) {
            throw new ValidationException("side required for Square");
        }
        if (requestDTO.getSide() <= 0) {
            throw new ValidationException("side cannot be negative or zero for Square");
        }
    }

    private void checkFieldsForCircle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getRadius() == null) {
            throw new ValidationException("radius required for Circle");
        }
        if (requestDTO.getRadius() <= 0) {
            throw new ValidationException("radius cannot be negative or zero for Circle");
        }
    }
}