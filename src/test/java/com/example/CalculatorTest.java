package com.fun;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExcuseGeneratorTest {

    @Test
    void excuseComesFromList() {
        assertTrue(ExcuseGenerator.EXCUSES.contains(ExcuseGenerator.getExcuse()));
    }

    @Test
    void zeroCoffeeIsZombie() {
        assertEquals("Zombie mode", ExcuseGenerator.coffeeMood(0));
    }

    @Test
    void threeCoffeesIs10x() {
        assertEquals("10x developer", ExcuseGenerator.coffeeMood(3));
    }

    @Test
    void tooMuchCoffee() {
        assertEquals("Can hear colors", ExcuseGenerator.coffeeMood(9));
    }

    @Test
    void negativeCoffeeThrows() {
        assertThrows(IllegalArgumentException.class, () -> ExcuseGenerator.coffeeMood(-1));
    }

    @Test
    void panicIsCappedAt10() {
        assertEquals(10, ExcuseGenerator.bugCountToPanic(9999));
    }
}