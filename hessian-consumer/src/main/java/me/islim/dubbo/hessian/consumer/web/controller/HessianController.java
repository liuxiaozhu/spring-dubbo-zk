package me.islim.dubbo.hessian.consumer.web.controller;

import me.islim.dubbo.api.GeneralApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HessianController {

    @Autowired
    private GeneralApi hessianService;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return hessianService.hello("lxz");
    }

}
