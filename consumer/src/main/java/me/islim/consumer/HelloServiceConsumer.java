package me.islim.consumer;

import me.islim.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceConsumer {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service = context.getBean(HelloService.class);
        System.out.println(service.sayHello("lxz"));

    }
}
