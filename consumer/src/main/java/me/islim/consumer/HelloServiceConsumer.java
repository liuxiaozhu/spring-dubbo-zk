package me.islim.consumer;

import com.alibaba.dubbo.rpc.RpcContext;
import me.islim.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class HelloServiceConsumer {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service = context.getBean(HelloService.class);
        Future<String> f = RpcContext.getContext().asyncCall(() -> service.sayHello("lxz"));
        System.out.println(f.get());
    }
}
