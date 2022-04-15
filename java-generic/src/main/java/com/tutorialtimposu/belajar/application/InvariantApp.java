package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.MyData;

// tipe data pada Generic harus sama tidak boleh induk atau child

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("ucup");
        // doId(stringMyData); // ERROR karena tipe data beda
        // MyData<Object> objectMyData = stringMyData; // ERROR

        //MyData<Object> objectMyData = new MyData<>(1000);
        //doIdInteger(objectMyData); // ERROR
    }

    public static void doId(MyData<Object> objectMyData) {
        // do nothing
    }

    public static void doIdInteger(MyData<Integer> objectMyData) {
        // do nothing
    }
}
