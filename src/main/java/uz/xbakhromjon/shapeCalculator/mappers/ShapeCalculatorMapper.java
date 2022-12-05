package uz.xbakhromjon.shapeCalculator.mappers;


import org.mapstruct.Mapper;
import uz.xbakhromjon.shapeCalculator.dtos.*;
import uz.xbakhromjon.shapeCalculator.shapes.*;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface ShapeCalculatorMapper {


    Circle toCircle(CircleRequestDTO requestDTO);

    Rectangle toRectangle(RectangleRequestDTO requestDTO);

    Square toSquare(SquareRequestDTO requestDTO);

    Triangle toTriangle(TriangleRequestDTO requestDTO);


    Cube toCube(CubeRequestDTO requestDTO);

    Parallelepiped toParallelepiped(ParallelepipedRequestDTO requestDTO);
}
