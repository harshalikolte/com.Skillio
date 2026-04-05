package com.Skillio.constuctor;

public class threeVarConstructor {
int id;
String name;
float  salary;
 threeVarConstructor() {
	id=102;
	name="Harsh";
	salary=10000;
}
 void display() {
     System.out.println("Id: " + id);
     System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
 }
 public static void main(String[] args) {

     threeVarConstructor t = new threeVarConstructor();

     t.display();
 }
}
