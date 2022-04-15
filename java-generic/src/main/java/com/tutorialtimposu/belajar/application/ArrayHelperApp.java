package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Azwar", "Munir", "Haryadi", "Kino"};
        Integer[] numbers = {38, 50, 31};

        System.out.println(
                ArrayHelper.<String>count(names) // memasukan tipe data tidak wajib
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
