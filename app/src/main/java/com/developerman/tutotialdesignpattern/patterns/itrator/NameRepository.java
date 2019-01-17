package com.developerman.tutotialdesignpattern.patterns.itrator;

public class NameRepository implements Container {
    private String names[] = {"Robert", "John", "Julie", "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
