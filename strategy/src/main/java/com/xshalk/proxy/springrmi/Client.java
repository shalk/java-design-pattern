package com.xshalk.proxy.springrmi;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

public class Client {

    @Bean
    RmiProxyFactoryBean service() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/SqrtService");
        rmiProxyFactoryBean.setServiceInterface(SqrtService.class);
        return rmiProxyFactoryBean;
    }

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Client.class, args);
//        System.out.println(Arrays.toString(LocateRegistry.getRegistry().list()));
        SqrtService service = SpringApplication.run(Client.class, args).getBean(SqrtService.class);
        System.out.println(service.sqrt(100));

    }
}
