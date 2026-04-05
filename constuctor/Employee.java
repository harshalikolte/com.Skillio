package com.Skillio.constuctor;

public class Employee {
String name;
float salary;

Employee(String name,float salary){
	this.name=name;
	this.salary=salary;
}
void display() {
	System.out.println("Employee name: " + name);
	System.out.println("Student salay: " + salary);
}
public static void main(String[] args) {
	Employee emp = new Employee("Ram",200000);
	emp.display();
}
}
