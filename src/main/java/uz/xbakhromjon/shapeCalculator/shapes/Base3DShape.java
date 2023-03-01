package uz.xbakhromjon.shapeCalculator.shapes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Base3DShape extends Base2DShape {
    @JsonIgnore
    Double getVolume();
}
