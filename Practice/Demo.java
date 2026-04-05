package com.Skillio.Practice;

public class Demo {

	    static int a = 10;   // Static variable

	    static {
	        System.out.println("Static Block");
	    }

	    int b = 20;  // Instance variable

	    {
	        System.out.println("Instance Block");
	    }

	    Demo() {
	        System.out.println("Constructor");
	    }

	    void display() {
	        System.out.println("Method");
	    }

	    public static void main(String[] args) {

	        System.out.println("Main Method");

	        Demo d = new Demo();
	        System.out.println(d.b);
	        System.out.println(a);
	        

	        d.display();
	    }
	}

