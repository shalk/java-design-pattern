package com.xshalk.state;

public class SoldState implements State {
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("马上要出糖果了，投币无效");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("马上要出糖果了，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("马上要出糖果了，无用摇动曲柄");
    }

    @Override
    public void dispense() {
        machine.relaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.noQuarterState);
        } else {
            System.out.println("Oops, out of gumballs");
            machine.setState(machine.soldOutState);
        }

    }
}
