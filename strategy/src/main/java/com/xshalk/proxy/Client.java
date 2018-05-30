package com.xshalk.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        try {

            MyService service =
                    (MyService) Naming.lookup("RemoteSqrt");
            double result = service.sqrt(100);
            System.out.println("sqrt(100) =" + result);

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
