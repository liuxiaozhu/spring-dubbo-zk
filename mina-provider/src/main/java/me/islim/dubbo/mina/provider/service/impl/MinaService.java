package me.islim.dubbo.mina.provider.service.impl;


import me.islim.dubbo.api.GeneralApi;

public class MinaService implements GeneralApi {
    @Override
    public String hello(String name) {
        System.out.println("Mina Service Got " + name);
        return "hello " + name;
    }
}
