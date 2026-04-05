package com.Skillio.constuctor;

public class ParameterConstructor {
    int rollno;
    String name;

    ParameterConstructor(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        ParameterConstructor p1 = new ParameterConstructor(101, "Ram");
        display d1 = new display(p1);
    }
}

class display {
    display(ParameterConstructor p) {
        System.out.println("rollno: " + p.rollno);
        System.out.println("name: " + p.name);
    }
}