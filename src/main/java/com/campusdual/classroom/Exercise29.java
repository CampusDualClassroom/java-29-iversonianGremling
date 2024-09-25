package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("This is a controlled exception.");
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
    }
}