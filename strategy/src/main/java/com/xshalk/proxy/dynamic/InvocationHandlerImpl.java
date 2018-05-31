package com.xshalk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
    private Object proxy;

    public InvocationHandlerImpl(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("starting proxying");
        Object res = method.invoke(this.proxy, args);
        System.out.println("finish proxying");
        return res;
    }
}
