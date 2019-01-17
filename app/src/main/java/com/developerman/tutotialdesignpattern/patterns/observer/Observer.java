package com.developerman.tutotialdesignpattern.patterns.observer;

public abstract class Observer {
    protected Subject subject;

    abstract void onUpdate();
}
