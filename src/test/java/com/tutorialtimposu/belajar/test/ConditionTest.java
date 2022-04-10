package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    // cek system properti
    @Test
    void testSystemPeroperty() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " " + value));
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testRunOnWindows() {

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void testDisableOnWindows() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testEnableOnJava8() {

    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void testDisableOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testEnabledOnJava14To17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testDisabledOnJava14To17() {

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    })
    void testEnableVendorOracle() {

    }
    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    })
    void testDisableVendorOracle() {

    }

}
