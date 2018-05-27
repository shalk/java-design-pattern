package com.xshalk.iterator;

import java.util.Iterator;

public class Test {

    public static void test(Iterator it) {
        System.out.println("\n--------------");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n--------------");
    }
    public static void main(String[] args) {
        System.out.println("This is iterator pattern");
        test(new DinerMenu().iterator());
        test(new PancakeHouseMenu().iterator());
    }
}
