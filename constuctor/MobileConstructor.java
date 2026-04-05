package com.Skillio.constuctor;

public class MobileConstructor {

	String model;
	int price;
	
	MobileConstructor(String model,int price){
		this.model=model;
		this.price=price;
	}
	void display() {
		System.out.println("Mobile model:"+model);
		System.out.println("Mobile price:"+price);
	}
	public static void main(String[] args) {
		MobileConstructor m=new MobileConstructor("vivo",15000);
		m.display();
	}
}
