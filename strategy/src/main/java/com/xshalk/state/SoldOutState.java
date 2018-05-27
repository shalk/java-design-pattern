package com.xshalk.state;

public class SoldOutState implements State {
    private GumballMachine machine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("卖光了别放硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("卖光了没有退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("卖光了没有用了");
    }

    @Override
    public void dispense() {
        System.out.println("卖光了不会出货");
    }
}
