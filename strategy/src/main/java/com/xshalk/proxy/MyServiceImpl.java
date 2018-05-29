package com.xshalk.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl extends UnicastRemoteObject implements MyService {

    protected MyServiceImpl() throws RemoteException {
    }

    @Override
    public void doSomething() throws RemoteException {
        System.out.println("server do sth");
    }

    @Override
    public void doOther() throws RemoteException {
        System.out.println("server do other");
    }

    @Override
    public double sqrt(int x) throws RemoteException {
        return Math.sqrt(x);
    }

}
