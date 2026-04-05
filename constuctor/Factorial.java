package com.Skillio.constuctor;
/*Write a program where constructor calculates factorial of a number.*/
public class Factorial {
	Factorial(int num){
		
	
	 int fact = 1;

	        for (int i = 1; i <= num; i++) {
	            fact = fact * i;
	        }

	        System.out.println("Factorial of " + num + " is: " + fact);
	    }

	    public static void main(String[] args) {

	        Factorial f = new Factorial(5);

	    }
	}