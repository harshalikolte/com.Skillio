package com.Skillio.constuctor;
/*Write a program to show difference between local variables and constructor variables.*/
public class localandConstructorVar {
int num;
localandConstructorVar(int num){
	this.num=num;
}
void display() {
	int num=20;
	System.out.println("number:"+num);
	System.out.println("constructor Variable:" +this.num);
}
public static void main(String[] args) {

	localandConstructorVar l = new localandConstructorVar(100);
    l.display();
}
}
