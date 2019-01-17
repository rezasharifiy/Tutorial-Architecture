package com.developerman.tutotialdesignpattern.patterns.factory;

import com.developerman.tutotialdesignpattern.patterns.factory.color.ColorFactory;
import com.developerman.tutotialdesignpattern.patterns.factory.shape.ShapeFactory;

public class FactoryProducer  {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
