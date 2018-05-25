package com.xshalk.factorymethod;

public class Pizza {

    protected String name;

    public Pizza() {
        name = "unkonw pizza";
    }

    public void prepare() {
        System.out.println("prepare pizza");
    }

    public void bake() {
        System.out.println("bake pizza");
    }

    public void cut() {
        System.out.println("cut pizza");
    }

    public void box() {
        System.out.println("box pizza");
    }

    public String getName() {
        return name;
    }

}
