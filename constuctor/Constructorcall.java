package com.Skillio.constuctor;

public class Constructorcall {


	    int id;
	    String name;

	
	    Constructorcall() {
	        this(101); 
	    }

	    
	    Constructorcall(int id) {
	        this(id, "Unknown"); 
	    }

	   
	    Constructorcall(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Id: " + id + " Name: " + name);
	    }

	    public static void main(String[] args) {
	        Constructorcall c = new Constructorcall();
	        c.display();
	    }
	}

