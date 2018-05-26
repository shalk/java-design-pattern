package com.xshalk.command;

public class SimpleRemoteControl {

    private static final int SIZE = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];
        Command noCommand = new NoCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slotNum, Command onCommand, Command offCommand) {
        onCommands[slotNum] = onCommand;
        offCommands[slotNum] = offCommand;
    }

    public void onButtonWasPressed(int slotNum) {
        onCommands[slotNum].execute();
        undoCommand = onCommands[slotNum];
    }

    public void offButtonWasPressed(int slotNum) {
        offCommands[slotNum].execute();
        undoCommand = offCommands[slotNum];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("\n-------- Remote Control ---------\n");
        for (int i = 0; i < SIZE; i++) {
            buff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + " " + offCommands[i].getClass().getSimpleName() + "\n");
        }
       buff.append("[undo]" + undoCommand.getClass().getName() + "\n");
        return buff.toString();
    }
}
