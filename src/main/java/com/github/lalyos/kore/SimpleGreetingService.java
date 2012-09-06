package com.github.lalyos.kore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleGreetingService implements GreetingService {

    private String greeting;

    @Autowired
    public SimpleGreetingService(@Value("Hello ")String greeting) {
        super();
        this.greeting = greeting;
    }

    public void greet(String msg) {
        System.out.println(greeting + " " + msg);
    }
}
