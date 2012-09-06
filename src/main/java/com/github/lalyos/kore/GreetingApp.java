package com.github.lalyos.kore;

public class GreetingApp {

    private GreetingService greetingService;
    private PersonRepository personRepository;
    
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
