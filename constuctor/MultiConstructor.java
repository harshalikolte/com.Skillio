package com.Skillio.constuctor;

class MultiConstructor {

    int id;
    String name;
    double marks;

    MultiConstructor() {
        id = 0;
        name = "Unknown";
        marks = 0.0;
    }

    MultiConstructor(int i, String n) {
        id = i;
        name = n;
        marks = 0.0;
    }

    MultiConstructor(int i, String n, double m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("ID: " + id +  " Name: " + name +  " Marks: " + marks);
    }

    public static void main(String[] args) {

        MultiConstructor m1 = new MultiConstructor();
        MultiConstructor m2 = new MultiConstructor(101, "Rahul");
        MultiConstructor m3 = new MultiConstructor(102, "Anita", 85);

        m1.display();
        m2.display();
        m3.display();
    }
}