package com.xshalk.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int SIZE = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;


    private class DinerMenuIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < numberOfItems;
        }

        @Override
        public Object next() {
            return menuItems[index++];
        }
    }

    public Iterator iterator() {
        return new DinerMenuIterator();
    }

    public DinerMenu() {
        menuItems = new MenuItem[SIZE];
        addItem("Vegetarian BLT",
                "Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "SOup of the day, with a side of potato salad:,",
                false,
                3.29);

        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= SIZE) {
            System.err.println("Sorry menu is full!!");
            ;
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
}
