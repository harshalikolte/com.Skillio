package com.Skillio.constuctor;
/*Write a program to demonstrate constructor overloading using different data types.*/
public class ConstructorOverloading {
	int id;
	String name;
	float percentage;
	ConstructorOverloading(int id,String name,float percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	void display() {
		System.out.println("Id:"+id);
		System.out.println("name:"+name);
		System.out.println("percentage:"+percentage);
	}
	public static void main(String[] args) {
		ConstructorOverloading c= new ConstructorOverloading(1,"gita",88.67f);
		c.display();
	}
}
