package com.Skillio.constuctor;

public class CopyConstructor {
int rollno;
String name;

CopyConstructor(int rollno,String name){
	this.rollno=rollno;
	this.name=name;
}

CopyConstructor(CopyConstructor c){
	this.rollno=c.rollno;
	this.name=c.name;
}
void display() {
	System.out.println("rollno:"+rollno);
	System.out.println("name:"+name);
}
public static void main(String[] args) {
	CopyConstructor c1=new CopyConstructor(10,"Shiv");
	CopyConstructor c2=new CopyConstructor(c1);
	
	c1.display();
	c2.display();
}
}

