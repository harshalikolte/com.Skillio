package com.Skillio.constuctor;
/*Create a constructor that calculates sum of two numbers.*/
public class SumTwoNo {
int num1;
int num2;
SumTwoNo(int num1,int num2){
	int sum=num1+num2;
	System.out.println("Sum:"+ sum);
}
public static void main(String[] args) {
	SumTwoNo s=new SumTwoNo(10,20);
	
}
}
