package com.Skillio.constuctor;
/*Write a constructor program that checks prime number.*/


public class Prime {

    Prime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Prime p = new Prime(12);   
    }
}