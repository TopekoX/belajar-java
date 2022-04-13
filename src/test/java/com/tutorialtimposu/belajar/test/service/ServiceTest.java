package com.tutorialtimposu.belajar.test.service;

import com.tutorialtimposu.belajar.test.data.Person;
import com.tutorialtimposu.belajar.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class ServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testPersonNotfound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           personService.get("not found");
        });
    }

    @Test
    void getPersonSuccess() {
        Mockito.when(personRepository.selectById("ucup"))
                .thenReturn(new Person("ucup", "topekox"));

        var person = personService.get("ucup");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("topekox", person.getName());
    }
}
