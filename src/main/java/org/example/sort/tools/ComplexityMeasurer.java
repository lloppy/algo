package org.example.sort.tools;

public class ComplexityMeasurer {
    private long counter;

    public ComplexityMeasurer() {
        counter = 0;
    }

    public void incrementCounter() {
        counter++;
    }

    public void resetCounter() {
        counter = 0;
    }

    public void printCounter() {
        System.out.println("Complexity: " + counter);
    }
}