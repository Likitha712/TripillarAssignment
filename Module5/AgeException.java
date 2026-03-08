package com.TripilarCodingAssignment.Module5;

public class AgeException {
    public static void main(String[] args) {

        int age = 19;

        if(age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

}
