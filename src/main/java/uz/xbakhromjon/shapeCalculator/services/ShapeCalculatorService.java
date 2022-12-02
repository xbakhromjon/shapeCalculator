package uz.xbakhromjon.shapeCalculator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.xbakhromjon.shapeCalculator.dtos.ShapeRequestDTO;
import uz.xbakhromjon.shapeCalculator.mappers.ShapeCalculatorMapper;
import uz.xbakhromjon.shapeCalculator.shapes.Base2DShape;
import uz.xbakhromjon.shapeCalculator.validators.ShapeCalculatorValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@RequiredArgsConstructor
public class ShapeCalculatorService {

    private final ShapeCalculatorValidator validator;
    private final ShapeCalculatorMapper mapper;

    public ResponseEntity<Double> findPerimeter(ShapeRequestDTO requestDTO) {
        validator.validate(requestDTO);
        Base2DShape shape = mapper.toShape(requestDTO);
        double result = shape.getPerimeter();
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<Double> findArea(ShapeRequestDTO requestDTO) {
        validator.validate(requestDTO);
        Base2DShape shape = mapper.toShape(requestDTO);
        double result = shape.getArea();
        return ResponseEntity.ok(result);
    }
}
