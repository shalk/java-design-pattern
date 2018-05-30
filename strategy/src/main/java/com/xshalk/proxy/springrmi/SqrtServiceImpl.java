package com.xshalk.proxy.springrmi;

public class SqrtServiceImpl implements SqrtService {

    @Override
    public double sqrt(int x) {
        return Math.sqrt(x);
    }
}
