package com.xshalk.composite;

public class Leaf extends MenuComponent {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }


    @Override
    String getName() {
        return name;
    }
}
