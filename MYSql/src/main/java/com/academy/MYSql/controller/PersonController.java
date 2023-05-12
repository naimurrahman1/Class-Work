package com.academy.MYSql.controller;

import com.academy.MYSql.model.Person;
import com.academy.MYSql.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;
    @PostMapping("/personSave")
    public List<Person> insertPerson(@RequestBody Person person)
    {
        personRepository.save(person);
        return personRepository.findAll();
    }

    @DeleteMapping("/personDelete/{id}")
    public List<Person> deletePerson(@PathVariable String id) {
        personRepository.deleteById(id);
        return personRepository.findAll();
    }

    @PutMapping("/personUpdate/{id}")
    public List<Person> updatePerson(@PathVariable String id, @RequestBody Person updatedPerson) {
        Person person = personRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid person Id:" + id));
        person.setId(updatedPerson.getId());
        person.setName(updatedPerson.getName());
        person.setAddress(updatedPerson.getAddress());
        personRepository.save(person);
        return personRepository.findAll();
    }

    @GetMapping("/showAll")
    public List<Person> showAll(@RequestBody Person person) {
        return personRepository.findAll();

    }


}

