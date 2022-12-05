package uz.xbakhromjon.shapeCalculator.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xbakhromjon.shapeCalculator.dtos.*;
import uz.xbakhromjon.shapeCalculator.services.ShapeCalculatorService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/calculator")
public class ShapeCalculatorController {

    private final ShapeCalculatorService service;

    @PostMapping(path = "/{type}/circle")
    public ResponseEntity<Double> handleCircleRequest(@PathVariable(name = "type") String type,  @RequestBody CircleRequestDTO requestDTO) {
        return service.handleCircleRequest(type, requestDTO);
    }

    @PostMapping(path = "/{type}/rectangle")
    public ResponseEntity<Double> handleRectangleRequest(@PathVariable(name = "type") String type, @RequestBody RectangleRequestDTO requestDTO) {
        return service.handleRectangleRequest(type, requestDTO);
    }

    @PostMapping(path = "/{type}/square")
    public ResponseEntity<Double> handleSquareRequest(@PathVariable(name = "type") String type, @RequestBody SquareRequestDTO requestDTO) {
        return service.handleSquareRequest(type, requestDTO);
    }

    @PostMapping(path = "/{type}/triangle")
    public ResponseEntity<Double> handleTriangleRequest(@PathVariable(name = "type") String type, @RequestBody TriangleRequestDTO requestDTO) {
        return service.handleTriangleRequest(type, requestDTO);
    }

    @PostMapping(path = "/{type}/cube")
    public ResponseEntity<Double> handleCubeRequest(@PathVariable(name = "type") String type, @RequestBody CubeRequestDTO requestDTO) {
        return service.handleCubeRequest(type, requestDTO);
    }
    @PostMapping(path = "/{type}/parallelepiped")
    public ResponseEntity<Double> handleParallelepipedRequest(@PathVariable(name = "type") String type, @RequestBody ParallelepipedRequestDTO requestDTO) {
        return service.handleParallelepipedRequest(type, requestDTO);
    }
}
