package com.Skillio.constuctor;

import java.util.Scanner;

class InputVariable {

    int id;
    String name;

    InputVariable() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        name = sc.next();
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        InputVariable s = new InputVariable();
        s.display();
    }
}