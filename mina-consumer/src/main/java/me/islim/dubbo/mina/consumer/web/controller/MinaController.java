package me.islim.dubbo.mina.consumer.web.controller;

import com.alibaba.dubbo.rpc.RpcContext;
import me.islim.dubbo.api.GeneralApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;


@Controller
public class MinaController {

    @Autowired
    private GeneralApi minaService;


    @RequestMapping("/")
    @ResponseBody
    public String hello() throws Exception{
        Future f = RpcContext.getContext().asyncCall((Callable<Object>) () -> minaService.hello("Martin"));
        return f.get().toString();
    }

    @RequestMapping("/sync")
    @ResponseBody
    public String hellosync() throws Exception{
        return minaService.hello("Sync");
    }
}
