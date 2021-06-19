package com.observerdp;

public class Reader implements Subscriber{
    @Override
    public void notifySubscriber(String news) {
        System.out.println("Reading :" + news);
    }

}
