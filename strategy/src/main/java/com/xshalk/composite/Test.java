package com.xshalk.composite;

public class Test {
    public static void main(String[] args) {
        Menu topMenu = new Menu("Top menu");

        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");

        topMenu.add(menu1);
        topMenu.add(menu2);

        Menu menu3 = new Menu("Menu3");


        menu1.add(new Leaf("leaf1"));
        menu1.add(new Leaf("leaf2"));

        menu2.add(new Leaf("leaf3"));
        menu2.add(new Leaf("leaf4"));
        menu2.add(menu3);

        menu3.add(new Leaf("leaf4"));
        menu3.add(new Leaf("leaf5"));

        topMenu.operation();
    }
}
