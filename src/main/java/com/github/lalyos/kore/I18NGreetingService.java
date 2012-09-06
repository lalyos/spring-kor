package com.github.lalyos.kore;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class I18NGreetingService implements GreetingService, MessageSourceAware {

    private MessageSource messageSource;
    
    @Value("${greeting.service.msg.key}")
    private String messageKey;
    
    @Value("${greeting.service.locale}")
    private Locale locale;
    
    public void greet(String msg) {
        String message = messageSource.getMessage(messageKey, null, locale);
        System.out.println(message + " " + msg);
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

}
