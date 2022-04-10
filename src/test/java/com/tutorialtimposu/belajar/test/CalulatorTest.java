package com.tutorialtimposu.belajar.test;

import com.tutorialtimposu.belajar.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

//@DisplayName("Test untuk Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalulatorTest {

    private Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Test Skenario sukses untuk methid add(integer, integer)")
    public void testAddSuccess() {
        Integer result = calculator.add(10, 10);

        // cara ini ribet
//        if (result != 20) {
//            throw new RuntimeException("test gagal");
//        }

        // cara yang direkomendasikan
        assertEquals(20, result);
    }

    @Test
//    @DisplayName("Test Skenario throw exception yang diinginkan (tidak error)")
    public void testDivideSuccess() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.devide(100, 0);
        });
    }

    @Test
    @Disabled
    public void commingSoon() {

    }
}
