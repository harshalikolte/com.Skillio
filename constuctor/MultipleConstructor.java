package com.Skillio.constuctor;

public class MultipleConstructor {
	    String name;
	    int age;

	    
	    MultipleConstructor() {
	        name = "Unknown";
	        age = 18;
	    }

	    
	    MultipleConstructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	    	MultipleConstructor s1 = new MultipleConstructor();            
	    	MultipleConstructor s2 = new MultipleConstructor("Ram", 22);   

	        s1.display();
	        s2.display();
	    }
	}

