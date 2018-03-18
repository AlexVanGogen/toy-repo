package ru.spbau.mit.practice.somecode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeClassTest {

    private SomeClass someClass;
    private final String input = "Systemoutprintln";

    @Before
    public void setUp() throws Exception {
        someClass = new SomeClass(input);
    }

    @Test
    public void increase() {
        someClass.increase();
        assertEquals(1, someClass.getCounter());
    }

    @Test
    public void decrease() {
        someClass.decrease();
        assertEquals(-1, someClass.getCounter());
    }

    @Test
    public void message() {
        someClass.increase();
        assertTrue(someClass.message().equals(input + " " + 1));
    }

    @Test
    public void printMessage() {
        someClass.decrease();
        someClass.printMessage();
        assertTrue(1 == 1);
    }
}