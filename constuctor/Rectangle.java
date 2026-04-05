package com.Skillio.constuctor;
//Create a class Rectangle with constructor that calculates area.
public class Rectangle {
int length;
int width;
int area;

Rectangle(int length,int width){
	this.length=length;
	this.width=width;
	area=length*width;
	
}
void display() {
	System.out.println("Rectangle Area:"+area);
}
public static void main(String[] args) {
	Rectangle r=new Rectangle(10,5);
	r.display();
}
}
