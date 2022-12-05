package uz.xbakhromjon.shapeCalculator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.xbakhromjon.shapeCalculator.dtos.*;
import uz.xbakhromjon.shapeCalculator.enums.Type;
import uz.xbakhromjon.shapeCalculator.exceptions.UniversalException;
import uz.xbakhromjon.shapeCalculator.mappers.ShapeCalculatorMapper;
import uz.xbakhromjon.shapeCalculator.shapes.*;
import uz.xbakhromjon.shapeCalculator.shapes.base.TwoDimensionalShape;
import uz.xbakhromjon.shapeCalculator.validators.ShapeCalculatorValidator;

import java.util.EnumSet;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@RequiredArgsConstructor
public class ShapeCalculatorService {

    private final ShapeCalculatorValidator validator;
    private final ShapeCalculatorMapper mapper;


    public ResponseEntity<Double> handleCircleRequest(String type, CircleRequestDTO requestDTO) {
        validator.validateForCircle(requestDTO);
        Circle shape = mapper.toCircle(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> handleRectangleRequest(String type, RectangleRequestDTO requestDTO) {
        validator.validateForRectangle(requestDTO);
        Rectangle shape = mapper.toRectangle(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> handleSquareRequest(String type, SquareRequestDTO requestDTO) {
        validator.validateForSquare(requestDTO);
        Square shape = mapper.toSquare(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> handleTriangleRequest(String type, TriangleRequestDTO requestDTO) {
        validator.validateForTriangle(requestDTO);
        Triangle shape = mapper.toTriangle(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> handleCubeRequest(String type, CubeRequestDTO requestDTO) {
        validator.validateForCube(requestDTO);
        Cube shape = mapper.toCube(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> handleParallelepipedRequest(String type, ParallelepipedRequestDTO requestDTO) {
        validator.validateForParallelepiped(requestDTO);
        Parallelepiped shape = mapper.toParallelepiped(requestDTO);
        Double result = getResult(type, shape);
        return ResponseEntity.ok(result);
    }

    private double getResult(String type, TwoDimensionalShape shape) {
        double result;
        if (type.equals(Type.PERIMETER.toString().toLowerCase())) {
            result = shape.getPerimeter();
        } else if (type.equals(Type.AREA.toString().toLowerCase())) {
            result = shape.getArea();
        } else {
            throw new UniversalException("Bad path variable: %s. You write these one %s".formatted(type, Type.stringValues()), HttpStatus.BAD_REQUEST);
        }
        return result;
    }
}
