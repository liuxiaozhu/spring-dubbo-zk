package me.islim.dubbo.hessian.provider.service.impl;


import me.islim.dubbo.api.GeneralApi;

public class HessianService implements GeneralApi {
    @Override
    public String hello(String name) {
        System.out.println("Hessian Service Got " + name);
        return "Hello " + name;
    }
}
