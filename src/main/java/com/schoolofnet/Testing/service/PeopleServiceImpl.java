package com.schoolofnet.Testing.service;

import com.schoolofnet.Testing.model.Person;
import com.schoolofnet.Testing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PersonRepository personRepository;

    public PeopleServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return this.personRepository.save(person);
    }
}
