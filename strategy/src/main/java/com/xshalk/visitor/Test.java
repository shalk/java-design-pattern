package com.xshalk.visitor;

public class Test {
    public static void main(String[] args) {
        Commander commander = new Commander("林司令",
                new Sergean("李连长",
                        new Soldier("zhangsan"),
                        new Soldier("lisi"),
                        new Soldier("wangwu")
                ),
                new Sergean("胡连长",
                        new Soldier("李四"),
                        new Soldier("liuliu"),
                        new Soldier("xiaoxiao")
                )
        );

//        CommanderVisitor visitor = new CommanderVisitor();
        commander.accept(new CommanderVisitor());
//        commander.accept(new SergeanVisitor());
//        commander.accept(new SoldierVisitor());

    }
}
