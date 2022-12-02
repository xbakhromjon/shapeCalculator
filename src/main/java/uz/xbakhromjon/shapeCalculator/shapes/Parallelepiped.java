package uz.xbakhromjon.shapeCalculator.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Parallelepiped implements ThreeDimensionalShape,  Base2DShape {
    private Double width;
    private Double height;
    private Double length;

    @Override
    public Double getArea() {
        return 2 * (width * height + width * length + height * length);
    }

    @Override
    public Double getPerimeter() {
        return 4 * (width + height + length);
    }


    @Override
    public Double getVolume() {
        return width * height * length;
    }
}
