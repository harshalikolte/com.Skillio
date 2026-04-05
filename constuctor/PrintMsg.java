package com.Skillio.constuctor;
//Write a program to print a message whenever an object is created
public class PrintMsg {
 PrintMsg()
 {
	System.out.println("Onject is created");
}
public static void main(String[] args) {
	PrintMsg pm1= new PrintMsg();
	PrintMsg pm2= new PrintMsg();
	PrintMsg pm3= new PrintMsg();
	
}
}
