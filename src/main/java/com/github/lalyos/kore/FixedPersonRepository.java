package com.github.lalyos.kore;

import java.util.ArrayList;
import java.util.List;

public class FixedPersonRepository implements PersonRepository {

    private List<Person> allPeople = new ArrayList<Person>();

    public FixedPersonRepository() {
        allPeople.add(new Person("gyorgy","matolcsy"));
        allPeople.add(new Person("viktor","orban"));
    }
    public List<Person> getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(List<Person> allPeople) {
        this.allPeople = allPeople;
    }
    
}
