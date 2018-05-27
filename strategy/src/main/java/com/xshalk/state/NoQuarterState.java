package com.xshalk.state;

public class NoQuarterState implements State {
    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("感谢投币，请摇动曲柄吧");
        machine.setState(machine.hasQUarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("当前未投币，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("当前未投币，请先投币");
    }

    @Override
    public void dispense() {
        System.out.println("当前未投币，投币之后，摇动曲柄");
    }
}
