package com.github.lalyos.kore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonRepository personRepository = new FixedPersonRepository();
        GreetingService greetingService = new SimpleGreetingService();
        GreetingApp app = new GreetingApp();
        app.setGreetingService(greetingService);
        app.setPersonRepository(personRepository);
        
        app.greetEverybody();
    }
}
