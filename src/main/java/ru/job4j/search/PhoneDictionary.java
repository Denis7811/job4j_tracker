package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findByName = person -> person.getName().equals(key);
        Predicate<Person> findBySurname = person -> person.getSurname().equals(key);
        Predicate<Person> findByPhone = person -> person.getPhone().equals(key);
        Predicate<Person> findByAddress = person -> person.getAddress().equals(key);
        Predicate<Person> combine = findByName.or(findBySurname).or(findByPhone).or(findByAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

