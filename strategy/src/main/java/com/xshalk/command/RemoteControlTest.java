package com.xshalk.command;

public class RemoteControlTest {
    public static void test() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println(remote);
        remote.onButtonWasPressed(0);
        System.out.println(remote);
        remote.offButtonWasPressed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();
    }

    public static final void testCeilingFanCommand() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remote.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        System.out.println(remote);

        remote.undoButtonWasPushed();

        remote.onButtonWasPressed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();

    }

    public static void main(String[] args) {
        testCeilingFanCommand();
    }
}
