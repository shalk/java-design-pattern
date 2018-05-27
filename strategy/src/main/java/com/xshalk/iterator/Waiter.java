package com.xshalk.iterator;

import java.util.Iterator;

public class Waiter {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waiter(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n====\nBREAKFAST");
        printMenu(pancakeHouseMenu.iterator());
        System.out.println("\nLUNCH");
        printMenu(dinerMenu.iterator());
    }

    private void printMenu(Iterator<MenuItem> it) {
        System.out.println();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void printBreakFastMenu() {

    }

    public void printLunchMenu() {

    }

    public static void main(String[] args) {
        Waiter waiter = new Waiter(new PancakeHouseMenu(), new DinerMenu());
        waiter.printMenu();
    }
}
