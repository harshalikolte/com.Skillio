package com.Skillio.constuctor;
/*Write a program to initialize student marks and calculate average using constructor.*/
public class AvgStudent {
int m1,m2,m3;
float average;

AvgStudent(int m1,int m2,int m3){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	
	average = (m1 + m2 + m3) / 3.0f;

    System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
    System.out.println("Average Marks: " + average);
}
public static void main(String[] args) {
	AvgStudent a=new AvgStudent(10,20,30);
}
}
