package me.islim.service.impl;


import me.islim.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name){
        return "Hello " + name + "!";
    }

    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("applicationContext.xml");
        System.in.read();
    }
}
