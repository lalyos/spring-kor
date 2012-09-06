package com.github.lalyos.kore;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@Configuration
public class GreetingConfiguration {

    @Bean
    public GreetingApp greetingApp() {
        GreetingApp app = new GreetingApp();
        app.setGreetingService(greetingService());
        app.setPersonRepository(personRepository());
        app.setOwner(new Person("Bill", "Clinton [owner]"));
        
        return app;
    }

    @Bean
    public GreetingService greetingService() {
        I18NGreetingService greetingService = new I18NGreetingService();
        greetingService.setLocale(new Locale("hu"));
        greetingService.setMessageKey("msg.welcome");
        return greetingService;
    }

    @Bean
    public PersonRepository personRepository() {
        FixedPersonRepository repository = new FixedPersonRepository();
        repository.getAllPeople().add(new Person("Viktar", "Orban"));
        repository.getAllPeople().add(new Person("Gergevics", "Matlocsy"));
        return repository;
    }
    
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource msg = new ReloadableResourceBundleMessageSource();
        msg.setBasename("messages");
        
        return msg;
    }
    
}
