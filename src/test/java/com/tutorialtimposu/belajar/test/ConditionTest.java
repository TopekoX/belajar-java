package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testRunOnWindows() {

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void testDisableOnWindows() {

    }

}
