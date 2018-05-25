package com.xshalk.singleton;

public class Foo4 {
    private static volatile Foo4 instance;

    private Foo4() {

    }

    public static Foo4 getInstance() {
        Foo4 result = instance;
        if (result == null) {
            synchronized (Foo4.class) {
                result = instance;
                if (result == null) {
                    result = new Foo4();
                    instance = result;
                }
            }
        }
        return result;
    }

}
