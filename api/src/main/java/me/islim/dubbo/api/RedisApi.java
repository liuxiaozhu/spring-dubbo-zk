package me.islim.dubbo.api;


public interface RedisApi {

    void putString(String key, String value);

    String getString(String key);
}
