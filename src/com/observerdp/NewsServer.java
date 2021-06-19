package com.observerdp;

import java.util.ArrayList;
import java.util.List;

public class NewsServer {
    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscriber(String news){
        for (Subscriber subscriber : subscribers){
            subscriber.notifySubscriber(news);
        }
    }
}
