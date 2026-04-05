package com.Skillio.constuctor;

class ArrayConstructor {

    int arr[];

   
    ArrayConstructor() {
        arr = new int[]{10, 20, 30, 40, 50};
    }

    void display() {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        ArrayConstructor a = new ArrayConstructor();
        a.display();
    }
}