package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Ucup");

        // cara 1
        process(stringMyData);

        // cara 2
        MyData<? extends Object> myData = stringMyData;

    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        //myData.setData("Halo"); // tidak bisa panggil get
    }
}
