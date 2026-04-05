package com.Skillio.constuctor;
/*reate a program that uses constructor to reverse a number.*/
public class ReverseNum {
	ReverseNum(int num){
		int reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		 System.out.println("Reversed Number: " + reverse);
	} 
	public static void main(String[] args) {
		ReverseNum r=new ReverseNum(1245);
	}
}
