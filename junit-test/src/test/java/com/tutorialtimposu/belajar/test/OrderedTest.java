package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.*;

// Test instance PER_CLASS akan memberikan instance per class
// secara default instancenya PER_METHOD

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    // contoh PER_METHOD
    // OrderedTest o = new OrderedTest();
    // o.test3();
    // OrderedTest o = new OrderedTest();
    // o.test2();
    // OrderedTest o = new OrderedTest();
    // o.test1();

    // contoh PER_CLASS
    // OrderedTest o = new OrderedTest();
    // o.test3();
    // o.test2();
    // o.test1();

    private int counter = 0;

    @Test
    @Order(2)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void test1() {
        counter++;
        System.out.println(counter);
    }
}
