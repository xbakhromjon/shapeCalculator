package uz.xbakhromjon.shapeCalculator.mappers;

import org.springframework.stereotype.Component;
import uz.xbakhromjon.shapeCalculator.dtos.ShapeRequestDTO;
import uz.xbakhromjon.shapeCalculator.enums.EShape;
import uz.xbakhromjon.shapeCalculator.shapes.*;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class ShapeCalculatorMapper {


    public BaseShape toCircle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.CIRCLE.name())) {
            return new Circle(requestDTO.getRadius());
        }
        return null;
    }

    public BaseShape toRectangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.RECTANGLE.name())) {
            return new Rectangle(requestDTO.getWidth(), requestDTO.getHeight());
        }
        return toCircle(requestDTO);
    }

    public BaseShape toSquare(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.SQUARE.name())) {
            return new Square(requestDTO.getSide());
        }
        return toTriangle(requestDTO);
    }

    public BaseShape toTriangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.TRIANGLE.name())) {
            return new Triangle(requestDTO.getA(), requestDTO.getB(), requestDTO.getC());
        }
        return toRectangle(requestDTO);
    }

    public BaseShape toShape(ShapeRequestDTO requestDTO) {
        if (requestDTO == null) {
            return null;
        }
        return toSquare(requestDTO);
    }
}
