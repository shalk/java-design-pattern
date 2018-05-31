package com.xshalk.proxy.dynamic;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Test1 {

    public static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                PersonBean.class.getClassLoader(),
                new Class[]{PersonBean.class},
                new OwnerInvocationHandler(person));
    }

    public static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                PersonBean.class.getClassLoader(),
                new Class[]{PersonBean.class},
                new NonOwnerInvocationHandler(person)
        );
    }

    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl("Joe JavaBean", "male", "football", 1, 9);

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name: " + ownerProxy.getName());
        ownerProxy.setInterests("basketball");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }

        System.out.println(joe);
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name: " + nonOwnerProxy.getName());
        System.out.println("Rate: " + nonOwnerProxy.getHotOrNotRating());
        System.out.println("try rating");
        nonOwnerProxy.setHotOrNotRating(7);
        System.out.println("getRate: " + nonOwnerProxy.getHotOrNotRating());
        try {
            nonOwnerProxy.setName("hahah");
        } catch (Exception e) {
            System.out.println("NonOwner can't change name");
        }

    }

}
