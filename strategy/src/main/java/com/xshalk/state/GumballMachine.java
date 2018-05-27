package com.xshalk.state;

public class GumballMachine {
    final State soldOutState;
    final State noQuarterState;
    final State hasQUarterState;
    final State soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQUarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void relaseBall() {
        System.out.println("出糖果");
        count--;
    }

    public int getCount() {
        return count;
    }
}
