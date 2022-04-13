package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void tetsMock() {

        List<String> list = Mockito.mock(List.class); // membuat objek tiruan

        Mockito.when(list.get(0)).thenReturn("Ucup"); // memasukan nilai ke objek tiruan
        Mockito.when(list.get(1_000)).thenReturn("Topekox"); // .....

        System.out.println(list.get(0)); // memanggil nilai
        System.out.println(list.get(1_000)); // ....

        Mockito.verify(list, Mockito.times(1)).get(0); // memverifikasi berapa kali method get dipanggil
    }
}
