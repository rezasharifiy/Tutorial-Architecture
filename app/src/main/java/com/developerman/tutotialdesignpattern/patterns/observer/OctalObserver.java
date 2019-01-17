package com.developerman.tutotialdesignpattern.patterns.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {

        this.subject = subject;

        this.subject.attach(this);

    }

    @Override
    public void onUpdate() {
        System.out.println("Octal String:: "
                + Integer.toBinaryString(subject.getState()));
    }

}
