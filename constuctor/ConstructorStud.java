package com.Skillio.constuctor;

public class ConstructorStud {
int rollno;
String name;

ConstructorStud(){
	rollno=0;
	name="Unknown";
}
ConstructorStud(int r){
	rollno=r;
	name="Unknown";
}
ConstructorStud( int r,String n){
	rollno=r;
	name=n;
}
void display() {
    System.out.println("Rollno: " + rollno+ " Name: " + name);
	
}
public static void main(String[] args) {
	
	
		ConstructorStud c1= new ConstructorStud();
		ConstructorStud c2= new ConstructorStud(101);
		ConstructorStud c3= new ConstructorStud(102,"Ram");
		
		c1.display();
		c2.display();
		c3.display();
	}
}
