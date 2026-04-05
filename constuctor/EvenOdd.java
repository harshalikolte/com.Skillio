package com.Skillio.constuctor;
/*Create a constructor that checks whether a number is even or odd.*/
public class EvenOdd {
	EvenOdd(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
public static void main(String[] args) {
		EvenOdd e=new EvenOdd(12);
	}
}
