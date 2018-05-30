package com.xshalk.proxy.springrmi;


import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

public class Server {

    @Bean
    SqrtService sqrtService() {
        return new SqrtServiceImpl();
    }

    @Bean
    RmiServiceExporter exporter(SqrtService impl) {
        Class<SqrtService> serviceInterface = SqrtService.class;
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceInterface(serviceInterface);
        exporter.setService(impl);
        exporter.setServiceName("SqrtService");
        exporter.setRegistryPort(1099);
        return exporter;
    }

    public static void main(String[] args) {
//        System.setProperty("")
        SpringApplication.run(Server.class, args);
    }
}
