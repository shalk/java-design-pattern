package com.xshalk.state;

public class WinState implements State {
    private GumballMachine machine;

    public WinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经中奖，不用投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已经中奖，不用退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("已经中奖，不用摇曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("即将出两个糖哦");
        machine.relaseBall();
        if (machine.getCount() > 0) {
            machine.relaseBall();
        }
        if (machine.getCount() <= 0) {
            machine.setState(machine.soldOutState);
        } else {
            machine.setState(machine.noQuarterState);
        }
    }
}
