package me.islim.dubbo.provider.service.impl;


import me.islim.dubbo.api.GeneralApi;

public class GeneralApiImpl implements GeneralApi {

    @Override
    public String hello(String name) {
        System.out.println("General Api Got " + name);
        return "Hello " + name;
    }
}
