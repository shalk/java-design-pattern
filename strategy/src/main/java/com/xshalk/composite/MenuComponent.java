package com.xshalk.composite;

public abstract class MenuComponent {
    void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    void operation() {
        System.out.println("Operation on " + getClass().getName() + " " + getName());
    }

    MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    abstract String getName();
}
