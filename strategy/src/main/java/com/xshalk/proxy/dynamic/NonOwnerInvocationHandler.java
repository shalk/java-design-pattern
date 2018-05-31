package com.xshalk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("setHotOrNotRating")) {
            return method.invoke(person, args);
        } else if (methodName.startsWith("set")) {
            throw new IllegalAccessException();
        } else if (methodName.startsWith("get")) {
            return method.invoke(person, args);
        } else {
            return null;
        }

    }
}
