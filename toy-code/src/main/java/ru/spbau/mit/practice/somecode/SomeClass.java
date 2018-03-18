package ru.spbau.mit.practice.somecode;

public class SomeClass {

    private final String inputString;
    private int counter;

    public SomeClass(String input) {
        inputString = input;
        counter = 0;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public String message() {
        return inputString + " " + counter;
    }

    public void printMessage() {
        System.out.println(message());
    }

    public int getCounter() {
        return counter;
    }
}
