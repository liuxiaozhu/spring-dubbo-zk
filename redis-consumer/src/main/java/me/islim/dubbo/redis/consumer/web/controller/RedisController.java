package me.islim.dubbo.redis.consumer.web.controller;

import me.islim.dubbo.api.RedisApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {

    @Autowired
    private RedisApi redisService;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        redisService.putString("lxz", "111");
        return redisService.getString("lxz");
    }
}
