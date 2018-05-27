package com.xshalk.state;

public class Test {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(1);
        machine.insertQuarter();
        machine.ejectQuarter();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
    }
}
