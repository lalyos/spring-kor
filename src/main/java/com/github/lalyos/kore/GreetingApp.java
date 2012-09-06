package com.github.lalyos.kore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingApp {

    @Autowired
    @Qualifier("i18n")
    private GreetingService greetingService;
    @Autowired
    private PersonRepository personRepository;
    
    @Value("Bill, Clinton")
    private Person owner;
    
    public GreetingService getGreetingService() {
        return greetingService;
    }
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public PersonRepository getPersonRepository() {
        return personRepository;
    }
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public void greetEverybody() {
        System.out.println("owner: " + owner + " is greeting everybody");
        for (Person nextPerson : personRepository.getAllPeople()) {
            greetingService.greet(nextPerson.toString());
        }
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
