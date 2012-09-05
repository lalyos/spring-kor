package com.github.lalyos.kore;

public class GreetingApp {

    private GreetingService greetingService;
    private PersonRepository personRepository;
    
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
        for (Person nextPerson : personRepository.getAllPeople()) {
            greetingService.greet(nextPerson.toString());
        }
    }
}
