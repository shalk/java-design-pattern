package com.xshalk.singleton;

public class Foo1 {
    private final static Foo1 instacne = new Foo1();

    private Foo1() {

    }

    public static Foo1 getInstance() {
        return instacne;
    }


}
