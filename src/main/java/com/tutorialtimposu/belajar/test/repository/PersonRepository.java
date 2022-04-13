package com.tutorialtimposu.belajar.test.repository;

import com.tutorialtimposu.belajar.test.data.Person;

public interface PersonRepository {

    Person selectById(String id);

}
