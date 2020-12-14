package com.od.dubbotest;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main( String[] args) throws IOException {
        SpringApplication.run("classpath*:spring-config.xml",args);
        System.out.println("Dubbo server started");
        System.out.println("Dubbo 服务端已经启动");
        while(true) {
            System.in.read();
        }
    }
}
