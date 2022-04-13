package com.tutorialtimposu.belajar.test;

import com.tutorialtimposu.belajar.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@DisplayName("Test untuk Calculator")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalulatorTest {

    private Calculator calculator = new Calculator();

    // @BeforeAll dan @AfterAll hanya dieksekusi satu
    // kali saja di awal dan akhir class Test tetapi syaratnya
    // method harus static
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    // @BeforeEach dan @AfterEach akan dieksekusi pada semua
    // method @Test
    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each");
    }

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

    // exception TestAbortedException akan membatalkan test
    // dalam situasi tertentu kita bisa menghadle apabila dalam kondisi tertentu
    // walaupun dia error karena exception tapi akan dianggap dibatalkan
    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");

        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("Test dibatalkan karena profile bukan DEV");
        }
    }

    // menggunakan assumeTrue untuk membatalkan test
    // walaupun dia error karena exception tapi akan dianggap dibatalkan
    @Test
    public void testAssumption() {
       assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }

}
