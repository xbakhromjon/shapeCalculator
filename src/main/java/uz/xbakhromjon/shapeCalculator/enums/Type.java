package uz.xbakhromjon.shapeCalculator.enums;

import java.util.EnumSet;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public enum Type {
    PERIMETER,
    AREA;

    public static String stringValues() {
        EnumSet<Type> types = EnumSet.allOf(Type.class);
        StringBuilder strBuilder = new StringBuilder("[");
        int size = types.size();
        int i = 0;
        for (Type type : types) {
            strBuilder.append(type.toString().toLowerCase());
            i++;
            if (i != size) {
                strBuilder.append(", ");
            }
        }
        strBuilder.append("]");
        return strBuilder.toString();
    }
}
