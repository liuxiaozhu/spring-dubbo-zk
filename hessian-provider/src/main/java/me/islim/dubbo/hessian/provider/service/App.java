package me.islim.dubbo.hessian.provider.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");
        context.start();
        System.in.read();
    }
}
