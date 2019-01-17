package com.developerman.tutotialdesignpattern.patterns.factory.shape;

import com.developerman.tutotialdesignpattern.patterns.factory.AbstractFactory;
import com.developerman.tutotialdesignpattern.patterns.factory.color.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    protected ShapeInterface getShape(String shape) {
        switch (shape) {
            case "oval":
                return new Oval();
            case "circle":
                return new Circel();
            case "square":
                return new Square();
        }

        return null;
    }

    @Override
    protected Color getColor(String shape) {
        return null;
    }
}
