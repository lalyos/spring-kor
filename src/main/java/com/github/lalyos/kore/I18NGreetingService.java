package com.github.lalyos.kore;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class I18NGreetingService implements GreetingService, MessageSourceAware {

    private MessageSource messageSource;
    
    public void greet(String msg) {
        String message = messageSource.getMessage("msg.welcome", null, Locale.ENGLISH);
        System.out.println(message + " " + msg);
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

}
