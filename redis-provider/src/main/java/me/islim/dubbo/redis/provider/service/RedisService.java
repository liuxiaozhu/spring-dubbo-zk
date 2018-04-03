package me.islim.dubbo.redis.provider.service;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;
import me.islim.dubbo.api.RedisApi;

import java.io.IOException;

public class RedisService implements RedisApi {

    @Override
    public String getString(String key) {
        return key;
    }

    @Override
    public void putString(String key, String value) {
        System.out.println(key + ":" + value);
    }

    public static void main( String[] args ) throws IOException {
        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://127.0.0.1:2181"));
        registry.register(URL.valueOf("redis://192.168.5.48/me.islim.dubbo.redis.provider.service.RedisService?category=providers&dynamic=false&application=redis-provider&group=redis&interface=me.islim.dubbo.api.RedisApi&get=getString&set=putString&loadbalance=consistenthash"));
        System.in.read();
    }
}
