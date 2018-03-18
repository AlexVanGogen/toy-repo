package ru.spbau.mit.practice.somecode;

public class SomeClass {

    private final String input_string;
    public int counter;

    public SomeClass(String input)
    {
        input_string = input;
        counter = 0;
    }

    public void increase()
    {
        counter++;
    }

    public void decrease()
    {
        counter--;
    }

    public String message()
    {
        return input_string + " " + counter;
    }

    public void printMessage()
    {
        System.out.println(message());
    }
}
