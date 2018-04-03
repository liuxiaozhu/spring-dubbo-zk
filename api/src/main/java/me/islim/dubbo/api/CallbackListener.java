package me.islim.dubbo.api;


public interface  CallbackListener {
    void changed(String msg) throws InterruptedException;
}
