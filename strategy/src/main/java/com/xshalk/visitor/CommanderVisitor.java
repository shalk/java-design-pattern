package com.xshalk.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommanderVisitor implements UnitVistor {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommanderVisitor.class);

    @Override
    public void visitSoldier(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visitSergean(Sergean sergean) {
        //
    }

    @Override
    public void visitCommander(Commander commander) {
        LOGGER.info("Good to see you commander {}", commander);
    }
}
