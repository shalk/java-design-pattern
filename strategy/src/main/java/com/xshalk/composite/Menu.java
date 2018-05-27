package com.xshalk.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    String name;
    List<MenuComponent> items;

    public Menu(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    @Override
    void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    void remove(MenuComponent component) {
        items.remove(component);
    }

    @Override
    MenuComponent getChild(int i) {
        return items.get(i);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void operation() {
        System.out.println("Operation on " + this.getClass().getSimpleName() + " " + name);
        for (MenuComponent item : items) {
            item.operation();
        }
    }
}
