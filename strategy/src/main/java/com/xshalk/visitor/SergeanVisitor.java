package com.xshalk.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SergeanVisitor implements UnitVistor {

    public static final Logger LOGGER = LoggerFactory.getLogger(SergeanVisitor.class);

    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitSergean(Sergean sergean) {
        LOGGER.info("nice to see you sergean {}", sergean);
    }

    @Override
    public void visitCommander(Commander commander) {

    }
}
