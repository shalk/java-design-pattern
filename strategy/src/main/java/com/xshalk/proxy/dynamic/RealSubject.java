package com.xshalk.proxy.dynamic;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("This is RealSubject");
    }
}
