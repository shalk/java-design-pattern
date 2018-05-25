package com.xshalk.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void test(Class clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = clazz.getMethod("getInstance");
        Object o1 = method.invoke(null, new Object[0]);
        Object o2 = method.invoke(null, new Object[0]);

        System.out.println(o1 == o2);
    }

    public static void main(String[] args) {
        System.out.println("this is SingleTon Pattern");
        try {
            // 方法一， 饿汉,静态初始化，提前创建； 线程安全
//        Foo1 o1 = Foo1.getInstance();
//        Foo1 o2 = Foo1.getInstance();

            test(Foo1.class);
            // 方法二,  懒加载 错误示范; 线程不安全
//            Foo2 o3 = Foo2.getInstance();
//            Foo2 o4 = Foo2.getInstance();
            test(Foo2.class);
            // 方法三： 懒加载，加锁
            test(Foo3.class);
            // 方法四： 双重校验锁，double check lock
            test(Foo4.class);
            // 方法五：静态内部类
            test(Foo5.class);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
