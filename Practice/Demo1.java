package com.Skillio.Practice;

public class Demo1 {


	    // Static variable
	    static int a = 10;

	    // Static block
	    static {
	        System.out.println("Static Block");
	        System.out.println("Static Variable value: " + a);
	    }

	    // Instance variable
	    int b = 20;

	    // Instance block
	    {
	        System.out.println("Instance Block");
	        System.out.println("Instance Variable value: " + b);
	    }

	    // Constructor
	    Demo1() {
	        System.out.println("Constructor");
	    }

	    // Method
	    void display() {
	        System.out.println("Method");
	    }

	    public static void main(String[] args) {

	        System.out.println("Main Method");

	        // Object creation
	        Demo1 obj = new Demo1();

	        // Method call
	        obj.display();
	    }
	}

