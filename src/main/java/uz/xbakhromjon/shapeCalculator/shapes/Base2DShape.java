package uz.xbakhromjon.shapeCalculator.shapes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Base2DShape {
    @JsonIgnore
    Double getArea();

    @JsonIgnore
    Double getPerimeter();
}
