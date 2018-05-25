package com.xshalk.singleton;

public class Foo3 {
    private static Foo3 instance;

    private Foo3() {
    }

    public static synchronized Foo3 getInstance() {
        if (instance == null) {
            instance = new Foo3();
        }
        return instance;
    }
}
