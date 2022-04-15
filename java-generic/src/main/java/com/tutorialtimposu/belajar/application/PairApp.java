package com.tutorialtimposu.belajar.application;

import com.tutorialtimposu.belajar.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer> pair =
                new Pair<String, Integer>("ucup", 30);

        System.out.println("Nama " + pair.getFirst());
        System.out.println("Usia " + pair.getSecond());
    }

}
