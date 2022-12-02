package uz.xbakhromjon.shapeCalculator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.xbakhromjon.shapeCalculator.dtos.ShapeRequestDTO;
import uz.xbakhromjon.shapeCalculator.mappers.ShapeCalculatorMapper;
import uz.xbakhromjon.shapeCalculator.shapes.BaseShape;
import uz.xbakhromjon.shapeCalculator.validators.ShapeCalculatorValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@RequiredArgsConstructor
public class ShapeCalculatorService {

    private final ShapeCalculatorValidator validator;
    private final ShapeCalculatorMapper mapper;

    public ResponseEntity<?> findArea(ShapeRequestDTO requestDTO) {
        validator.validate(requestDTO);
        BaseShape shape = mapper.toShape(requestDTO);
        double result = shape.getArea();
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<?> findPerimeter(ShapeRequestDTO requestDTO) {
        validator.validate(requestDTO);
        BaseShape shape = mapper.toShape(requestDTO);
        double result = shape.getPerimeter();
        return ResponseEntity.ok(result);
    }
}
