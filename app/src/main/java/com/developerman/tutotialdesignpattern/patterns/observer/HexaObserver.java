package com.developerman.tutotialdesignpattern.patterns.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {

        this.subject = subject;

        this.subject.attach(this);

    }

    @Override
    public void onUpdate() {
        System.out.println("Hex String: "
                + Integer.toBinaryString(subject.getState()));
    }

}
