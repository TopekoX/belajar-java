package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.MyData;

// fungsinya hanya nge-print
public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(10));
        print(new MyData<String>("Abu"));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }

}
