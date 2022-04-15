package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Budi","Indonesia"),
                new Person("Ucup","Indonesia"),
                new Person("Azwar","Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
