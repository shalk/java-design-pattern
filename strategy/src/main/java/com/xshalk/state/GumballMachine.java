package com.xshalk.state;

import java.util.Random;

public class GumballMachine {
    final State soldOutState;
    final State noQuarterState;
    final State hasQUarterState;
    final State soldState;
    final State winState;

    private State state;
    private int count = 0;


    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQUarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winState = new WinState(this);
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

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }
}
