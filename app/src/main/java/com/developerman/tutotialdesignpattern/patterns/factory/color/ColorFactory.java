package com.developerman.tutotialdesignpattern.patterns.factory.color;

import com.developerman.tutotialdesignpattern.patterns.factory.AbstractFactory;
import com.developerman.tutotialdesignpattern.patterns.factory.shape.ShapeInterface;

public class ColorFactory extends AbstractFactory {


    @Override
    protected Color getColor(String color) {
        switch (color) {
            case "blue":
                return new Bule();
            case "yellow":
                return new Yellow();
            case "green":
                return new Green();
        }
        return null;
    }


    @Override
    protected ShapeInterface getShape(String shape) {
        return null;
    }

}
