package com.Skillio.constuctor;

public class ConstructorAndMethod {
	ConstructorAndMethod(){
		System.out.println("this is constructor");
		
	}
	void show() {
		System.out.println("this is method");

	}
	public static void main(String [] args) {
		ConstructorAndMethod cm=new ConstructorAndMethod();
		cm.show();
	}
	
}
