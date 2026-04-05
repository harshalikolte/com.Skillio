package com.Skillio.constuctor;

class AnotherObjConstructor {

    int rollno;
    String name;

    AnotherObjConstructor(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

class Display {
    Display(AnotherObjConstructor a) {
        System.out.println("Roll No: " + a.rollno);
        System.out.println("Name: " + a.name);
    }
}

 class Main {
    public static void main(String[] args) {
        AnotherObjConstructor a1 = new AnotherObjConstructor(101, "Ram");
        Display d1 = new Display(a1);
    }
}