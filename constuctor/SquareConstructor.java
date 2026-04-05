package com.Skillio.constuctor;

public class SquareConstructor {
	int num;
	SquareConstructor(int num){
		int square=num* num;
		System.out.println("Number:" +num);
		System.out.println("Square:" + square);
	}
	public static void main(String[] args) {
		SquareConstructor s= new SquareConstructor(5);
		
	}
}
