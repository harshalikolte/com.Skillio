package com.Skillio.constuctor;

public class SimpleInterest {
double principle,rate,time,si;
SimpleInterest(double principle,double rate,double time){
	this.principle=principle;
	this.rate=rate;
	this.time=time;
	
	si=(principle+rate+time)/100;
	
}
void display() {
	System.out.println("Simple Interest:"+si);
}
public static void main(String[] args) {
	SimpleInterest s= new SimpleInterest(1000,12,2);
	s.display();
}
}
