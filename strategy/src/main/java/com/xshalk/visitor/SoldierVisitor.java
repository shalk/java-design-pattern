package com.xshalk.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoldierVisitor implements UnitVistor {
    public static final Logger LOGGER = LoggerFactory.getLogger(SoldierVisitor.class);

    @Override
    public void visitSoldier(Soldier soldier) {
        LOGGER.info("nice to see you soldier {}", soldier);
    }

    @Override
    public void visitSergean(Sergean sergean) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
