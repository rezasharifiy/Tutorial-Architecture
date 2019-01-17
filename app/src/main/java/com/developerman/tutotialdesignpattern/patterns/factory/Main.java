package com.developerman.tutotialdesignpattern.patterns.factory;

public class Main {
    public Main() {
        AbstractFactory abstractFactory=FactoryProducer.getFactory("SHAPE");

    }
}
