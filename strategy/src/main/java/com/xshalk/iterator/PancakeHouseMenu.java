package com.xshalk.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    private class PancakeHouseMenuIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < menuItems.size();
        }

        @Override
        public Object next() {
            return menuItems.get(index++);
        }
    }

    public Iterator iterator() {
        return new PancakeHouseMenuIterator();
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
