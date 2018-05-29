package com.xshalk.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyService extends Remote {
    void doSomething() throws RemoteException;

    void doOther() throws RemoteException;

    double sqrt(int x) throws RemoteException;
}
