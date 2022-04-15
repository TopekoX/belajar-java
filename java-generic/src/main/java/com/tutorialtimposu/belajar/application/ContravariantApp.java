package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<Object>("Ucup");

        // cara 1
        process(objectMyData);

        System.out.println(objectMyData.getData());

        // cara 2
        MyData<? super String> myData = objectMyData;
        System.out.println(myData.getData());
    }

    // konversi
    public static void process(MyData<? super String> myData) {
        myData.setData("Ucup Topekox");
    }
}
