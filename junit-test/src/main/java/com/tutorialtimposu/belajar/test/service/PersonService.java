package com.tutorialtimposu.belajar.test.service;

import com.tutorialtimposu.belajar.test.data.Person;
import com.tutorialtimposu.belajar.test.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id) {
        Person person = personRepository.selectById(id);

        if (person != null) {
            return person;
        } else {
            throw new IllegalArgumentException("Person not found");
        }
    }

    public Person register(String name) {
        var person = new Person(UUID.randomUUID().toString(), name);
        personRepository.insertPerson(person);
        return person;
    }

}
