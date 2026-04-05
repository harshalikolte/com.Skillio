package com.Skillio.Encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

        Encapsulation s = new Encapsulation();  // corrected class name

        // Setting values using setter methods
        s.setRollNo(101);
        s.setName("Rahul");

        // Getting values using getter methods
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}