package services.impl;

import classes.Person;
import services.PersonInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonImpl implements PersonInterface {
    private ArrayList<Person> people = new ArrayList<>();

    @Override
    public String createPerson(Person... person) {
        people.addAll(Arrays.asList(person));
        return "Created people";
    }

    @Override
    public ArrayList<Person> getAllPeople() {
        return people;
    }
}
