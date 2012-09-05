package com.github.lalyos.kore;

public class SimpleGreetingService implements GreetingService {

    private String greeting;

    public SimpleGreetingService(String greeting) {
        super();
        this.greeting = greeting;
    }

    public void greet(String msg) {
        System.out.println(greeting + " " + msg);
    }
}
