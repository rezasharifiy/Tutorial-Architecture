package com.developerman.tutotialdesignpattern.patterns.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {

        this.subject = subject;

        this.subject.attach(this);

    }

    @Override
    public void onUpdate() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }

}
