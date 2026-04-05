package com.Skillio.constuctor;
//**Write a program to demonstrate constructor initialization of instance variables.
class InstanceVar {

    int id=101;

InstanceVar() {
       this.id = id;
    }

    void display() {
        System.out.println("InstanceVar ID: " + id);
    }

    public static void main(String[] args) {
    	InstanceVar var = new InstanceVar();
        var.display();
    }
}