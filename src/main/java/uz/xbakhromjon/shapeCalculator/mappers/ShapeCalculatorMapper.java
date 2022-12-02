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


    public Base2DShape toCircle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.CIRCLE.name())) {
            return new Circle(requestDTO.getRadius());
        }
        return toCube(requestDTO);
    }

    public Base2DShape toCube(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.CUBE.name())) {
            return new Cube(requestDTO.getSide());
        }
        return toParallelepiped(requestDTO);
    }

    public Base2DShape toParallelepiped(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.PARALLELEPIPED.name())) {
            return new Parallelepiped(requestDTO.getWidth(), requestDTO.getHeight(), requestDTO.getLength());
        }
        return null;
    }

    public Base2DShape toRectangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.RECTANGLE.name())) {
            return new Rectangle(requestDTO.getWidth(), requestDTO.getHeight());
        }
        return toCircle(requestDTO);
    }

    public Base2DShape toSquare(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.SQUARE.name())) {
            return new Square(requestDTO.getSide());
        }
        return toTriangle(requestDTO);
    }

    public Base2DShape toTriangle(ShapeRequestDTO requestDTO) {
        if (requestDTO.getShapeCode().equals(EShape.TRIANGLE.name())) {
            return new Triangle(requestDTO.getA(), requestDTO.getB(), requestDTO.getC());
        }
        return toRectangle(requestDTO);
    }

    public Base2DShape toShape(ShapeRequestDTO requestDTO) {
        if (requestDTO == null) {
            return null;
        }
        return toSquare(requestDTO);
    }
}
