package com.xshalk.state;

public class HasQuarterState implements State {
    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币，不用再投币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币成功");
        machine.setState(machine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("准备出售");
        machine.setState(machine.soldState);
    }

    @Override
    public void dispense() {
        System.out.println("先摇动曲柄，才会出售");
    }
}
