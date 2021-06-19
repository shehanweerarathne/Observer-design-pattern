package com.observerdp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Subscriber subscriber1 = new Reader();
        Subscriber subscriber2 = new FoodWrapper();
        Subscriber subscriber3 = new Reader();
        NewsServer newsServer = new NewsServer();

        newsServer.subscribe(subscriber1);
        newsServer.subscribe(subscriber2);
        newsServer.subscribe(subscriber3);

        newsServer.notifySubscriber("Fuel prices increased");
        newsServer.unsubscribe(subscriber3);
        newsServer.notifySubscriber("Fuel prices increased");
    }
}
