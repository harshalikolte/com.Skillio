package com.Skillio.constuctor;

public class DefaultVal {
int x; 
float f;
String s;
		 
 DefaultVal(){
 
 }
public static void main(String[] args) {
	DefaultVal dv= new DefaultVal();
	System.out.println(dv.x);
	System.out.println(dv.s);
	System.out.println(dv.f);
}
}