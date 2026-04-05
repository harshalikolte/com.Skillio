package com.Skillio.constuctor;
/*Write a program to create 5 objects using constructor and display their values.*/
public class DisplayObject {
int id;
DisplayObject(int id){
	this.id=id;
	
}
void display() {
	System.out.println("Id:"+id);
}
public static void main(String[] args) {
	DisplayObject d1=new DisplayObject(10);
	DisplayObject d2=new DisplayObject(20);
	DisplayObject d3=new DisplayObject(30);
	DisplayObject d4=new DisplayObject(40);
	DisplayObject d5=new DisplayObject(50);

	d1.display();
	d2.display();
	d3.display();
	d4.display();
	d5.display();
}
}
