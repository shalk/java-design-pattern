package com.xshalk.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Test {
    public static void main(String[] args) {
        try {
//            String remoteip = "10.0.62.12";

            String remoteip = "10.0.62.12";
            // -Djava.rmi.server.hostname=10.0.62.12;
            System.setProperty("java.rmi.server.hostname", remoteip);
            /*
            -Djava.rmi.server.useCodebaseOnly=false
            -Djava.security.policy="policy.permission"
            */

//            System.setProperty("java.rmi.server.useCodebaseOnly", "false");
//            System.setProperty("java.security.policy", "policy.permission");

            MyServiceImpl service = new MyServiceImpl();

            System.clearProperty("java.rmi.server.hostname");
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("RemoteSqrt", service);
//            Naming.rebind("RemoteSqrt", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
