package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.MyData;

public class GenericClassApp {

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("ucup");
        MyData<Integer> integerMyData = new MyData<Integer>(20);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
