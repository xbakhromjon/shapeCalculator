package uz.xbakhromjon.shapeCalculator.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.xbakhromjon.shapeCalculator.dtos.ShapeRequestDTO;
import uz.xbakhromjon.shapeCalculator.services.ShapeCalculatorService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequiredArgsConstructor
public class ShapeCalculatorController {

    private final ShapeCalculatorService service;

    @PostMapping(path = "/perimeter")
    public ResponseEntity<?> findPerimeter(@RequestBody ShapeRequestDTO shapeRequestDTO) {
        return service.findPerimeter(shapeRequestDTO);
    }

    @PostMapping(path = "/area")
    public ResponseEntity<?> findArea(@RequestBody ShapeRequestDTO shapeRequestDTO) {
        return service.findArea(shapeRequestDTO);
    }
}
