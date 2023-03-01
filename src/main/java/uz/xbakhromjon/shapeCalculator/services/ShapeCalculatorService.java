package uz.xbakhromjon.shapeCalculator.services;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.xbakhromjon.shapeCalculator.shapes.Base2DShape;
import uz.xbakhromjon.shapeCalculator.shapes.Base3DShape;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@RequiredArgsConstructor
public class ShapeCalculatorService {
    public ResponseEntity<Double> findPerimeter(Base2DShape shape) {
        return ResponseEntity.ok(shape.getPerimeter());
    }

    public ResponseEntity<Double> findArea(Base2DShape shape) {
        return ResponseEntity.ok(shape.getArea());
    }

    public ResponseEntity<Double> findVolume(Base3DShape shape) {
        return ResponseEntity.ok(shape.getVolume());
    }
}
