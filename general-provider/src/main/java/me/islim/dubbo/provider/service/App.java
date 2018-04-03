package me.islim.dubbo.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.in.read();
    }
}
