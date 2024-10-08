package Prototype_2_Class;

import java.util.HashMap;
import java.util.Map;
abstract class Color implements Cloneable {
    protected String colorName;
    abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
