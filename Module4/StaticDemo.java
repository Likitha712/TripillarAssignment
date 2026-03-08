package com.TripilarCodingAssignment.Module4;

public class StaticDemo {

    static int count = 0;

    static void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        count++;
        display();
    }

}
