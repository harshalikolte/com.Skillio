package com.Skillio.constuctor;

public class ConstructorCount {
	static int count = 0;

    ConstructorCount() {
        count++;
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        ConstructorCount c1 = new ConstructorCount();
        ConstructorCount c2 = new ConstructorCount();
        ConstructorCount c3 = new ConstructorCount();

        System.out.println("Number of times constructor called: " + count);
    }
}
