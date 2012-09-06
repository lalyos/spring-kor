package com.github.lalyos.kore;

import java.util.Locale;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;


@Configuration
public class GreetingConfiguration {

    @Bean
    public GreetingApp greetingApp() {
        GreetingApp app = new GreetingApp();
        //app.setGreetingService(greetingService());
        //app.setPersonRepository(personRepository());
        app.setOwner(new Person("Bill", "Clinton [owner]"));
        
        return app;
    }

    @Bean
    public GreetingService greetingService() {
        I18NGreetingService greetingService = new I18NGreetingService();
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
    
    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholder() {
        PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
        placeholderConfigurer.setLocation(new ClassPathResource("greeting.properties"));
        return placeholderConfigurer;
    }
    
}
