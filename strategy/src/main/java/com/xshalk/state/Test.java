package com.xshalk.state;

public class Test {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(10);
        machine.insertQuarter();
        machine.ejectQuarter();
        System.out.println("---------------");
        machine.insertQuarter();
        machine.turnCrank();
        System.out.println("---------------");
        machine.insertQuarter();
        machine.turnCrank();
    }
}
