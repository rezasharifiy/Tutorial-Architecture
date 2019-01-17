package com.developerman.tutotialdesignpattern.patterns.factory;

import com.developerman.tutotialdesignpattern.patterns.factory.color.Color;
import com.developerman.tutotialdesignpattern.patterns.factory.shape.ShapeInterface;

public abstract class AbstractFactory  {
   protected abstract ShapeInterface getShape(String shape);
   protected abstract Color getColor(String shape);
}
