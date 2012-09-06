package com.github.lalyos.kore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class FixedPersonRepository implements PersonRepository {

    @Autowired
    @Qualifier("male")
    private List<Person> allPeople = new ArrayList<Person>();

    public FixedPersonRepository() {
    }
    public List<Person> getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(List<Person> allPeople) {
        this.allPeople = allPeople;
    }
    
}
