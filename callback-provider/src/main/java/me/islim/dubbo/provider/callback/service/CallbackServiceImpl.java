package me.islim.dubbo.provider.callback.service;


import me.islim.dubbo.api.CallbackListener;
import me.islim.dubbo.api.CallbackService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CallbackServiceImpl implements CallbackService {

//    private final Map<String, CallbackListener> listeners = new ConcurrentHashMap<String, CallbackListener>();

    public CallbackServiceImpl() {
//        Thread t = new Thread(new Runnable() {
//            public void run() {
//                while (true) {
//                    try {
//                        for (Map.Entry<String, CallbackListener> entry : listeners.entrySet()) {
//                            try {
//                                entry.getValue().changed(getChanged(entry.getKey()));
//                            } catch (Throwable t) {
//                                listeners.remove(entry.getKey());
//                            }
//                        }
//                        Thread.sleep(5000); // timely trigger change event
//                    } catch (Throwable t) {
//                        t.printStackTrace();
//                    }
//                }
//            }
//        });
//        t.setDaemon(true);
//        t.start();
    }

    @Override
    public void addListener(String key, CallbackListener listener) {
//        listeners.put(key, listener);
        String result = getChanged(key);
        System.out.println(result);
        try {
            listener.changed(result); // send notification for change
        } catch (InterruptedException e) {
            
        }
    }

    private String getChanged(String key) {
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.in.read();
    }

}