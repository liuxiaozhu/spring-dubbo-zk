package me.islim.dubbo.api;


public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
