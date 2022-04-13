package com.tutorialtimposu.belajar.test;

public class Calculator {

    public Integer devide(Integer first, Integer second) {
        if(second == 0) {
            throw new IllegalArgumentException("Tidak dapat dibagi 0");
        } else {
            return first / second;
        }
    }

    public Integer add (Integer first, Integer second) {
        return first + second;
    }

}
