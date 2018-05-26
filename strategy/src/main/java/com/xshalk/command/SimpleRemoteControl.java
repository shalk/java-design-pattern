package com.xshalk.command;

public class SimpleRemoteControl {

    public static final int SIZE = 7;
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];
        Command noCommand = new NoCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slotNum, Command onCommand, Command offCommand) {
        onCommands[slotNum] = onCommand;
        offCommands[slotNum] = offCommand;
    }

    public void onButtonWasPressed(int slotNum) {
        onCommands[slotNum].execute();
    }

    public void offButtonWasPressed(int slotNum) {
        offCommands[slotNum].execute();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("\n-------- Remote Control ---------\n");
        for (int i = 0; i < SIZE; i++) {
            buff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + " " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return buff.toString();
    }
}
