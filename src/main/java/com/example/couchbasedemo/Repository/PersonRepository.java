package com.example.couchbasedemo.Repository;

import com.example.couchbasedemo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByFirstName(String firstName);

//    Person findOne(String id);
}