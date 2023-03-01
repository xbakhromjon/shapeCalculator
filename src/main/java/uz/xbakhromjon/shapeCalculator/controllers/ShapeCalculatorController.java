package uz.xbakhromjon.shapeCalculator.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.xbakhromjon.shapeCalculator.services.ShapeCalculatorService;
import uz.xbakhromjon.shapeCalculator.shapes.*;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class ShapeCalculatorController {

    private final ShapeCalculatorService service;

    @PostMapping(path = "/perimeter/circle")
    public ResponseEntity<Double> findPerimeter(@RequestBody @Valid Circle circle) {
        return service.findPerimeter(circle);
    }

    @PostMapping(path = "/perimeter/cube")
    public ResponseEntity<Double> findPerimeter(@RequestBody @Valid Cube cube) {
        return service.findPerimeter(cube);
    }

    @PostMapping(path = "/perimeter/parallelepiped")
    public ResponseEntity<Double> findPerimeter(@RequestBody @Valid Parallelepiped parallelepiped) {
        return service.findPerimeter(parallelepiped);
    }

    @PostMapping(path = "/perimeter/rectangle")
    public ResponseEntity<Double> findPerimeter(@RequestBody @Valid Rectangle rectangle) {
        return service.findPerimeter(rectangle);
    }

    @PostMapping(path = "/perimeter/triangle")
    public ResponseEntity<Double> findPerimeter(@RequestBody @Valid Triangle triangle) {
        return service.findPerimeter(triangle);
    }


    @PostMapping(path = "/area/circle")
    public ResponseEntity<Double> findArea(@RequestBody @Valid Circle circle) {
        return service.findArea(circle);
    }

    @PostMapping(path = "/area/cube")
    public ResponseEntity<Double> findArea(@RequestBody @Valid Cube cube) {
        return service.findArea(cube);
    }

    @PostMapping(path = "/area/parallelepiped")
    public ResponseEntity<Double> findArea(@RequestBody @Valid Parallelepiped parallelepiped) {
        return service.findArea(parallelepiped);
    }

    @PostMapping(path = "/area/rectangle")
    public ResponseEntity<Double> findArea(@RequestBody @Valid Rectangle rectangle) {
        return service.findArea(rectangle);
    }

    @PostMapping(path = "/area/triangle")
    public ResponseEntity<Double> findArea(@RequestBody @Valid Triangle triangle) {
        return service.findArea(triangle);
    }

    @PostMapping(path = "/volume/cube")
    public ResponseEntity<Double> findVolume(@RequestBody @Valid Cube cube) {
        return service.findVolume(cube);
    }

    @PostMapping(path = "/volume/parallelepiped")
    public ResponseEntity<Double> findVolume(@RequestBody @Valid Parallelepiped parallelepiped) {
        return service.findVolume(parallelepiped);
    }


}
