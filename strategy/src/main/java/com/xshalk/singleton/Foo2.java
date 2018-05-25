package com.xshalk.singleton;

public class Foo2 {
    private static Foo2 instance;

    private Foo2() {
    }

    public static Foo2 getInstance() {
        if (instance == null)
            instance = new Foo2();
        return instance;
    }
}
