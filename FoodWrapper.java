package com.observerdp;

public class FoodWrapper implements Subscriber{
    @Override
    public void notifySubscriber(String news) {
        System.out.println("Wrapping food");
    }

}
