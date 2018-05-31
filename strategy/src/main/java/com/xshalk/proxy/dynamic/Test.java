package com.xshalk.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Subject subject1 = new RealSubject();
        subject1.request();

        Subject obj1 = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new InvocationHandlerImpl(new RealSubject())
        );
        obj1.request();
    }
}
