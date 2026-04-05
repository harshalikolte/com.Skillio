package com.Skillio.constuctor;

public class NoofConstructor {
	int rollno;
    String name;

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        NoofConstructor obj = new NoofConstructor();  
        obj.display();

    }
}
