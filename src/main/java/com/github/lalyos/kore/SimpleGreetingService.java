package com.github.lalyos.kore;

public class SimpleGreetingService implements GreetingService {

    public void greet(String msg) {
        System.out.println("hello " + msg);
    }
}
