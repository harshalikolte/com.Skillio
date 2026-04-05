package com.Skillio.constuctor;
//**create a class car with a constructor that initializes brand and price
public class Car {

     String brand;
     int price;

   
    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    public static void main(String[] args) {
        Car c = new Car("Toyota",800000);
        System.out.println(c.brand);
        System.out.println(c.price);
     
        
    }
}
