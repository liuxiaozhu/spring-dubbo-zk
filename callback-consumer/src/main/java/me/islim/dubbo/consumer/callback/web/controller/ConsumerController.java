package me.islim.dubbo.consumer.callback.web.controller;

import me.islim.dubbo.api.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConsumerController {

    @Autowired
    private CallbackService callbackService;

    @RequestMapping("/")
    @ResponseBody
    public String test(){

        callbackService.addListener("foo.bar", msg -> {
            Thread.sleep(100);
            System.out.println("callback1:" + msg);
        });

        return "success";
    }

}
