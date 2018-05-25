package com.xshalk.singleton;

public class Foo5 {
    private Foo5() {

    }

    private static class Foo5Holder {
        public static final Foo5 instance = new Foo5();
    }

    public static Foo5 getinstance() {
        return Foo5Holder.instance;
    }
}
