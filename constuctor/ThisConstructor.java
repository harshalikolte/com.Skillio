/*package com.Skillio.constuctor;

public class ThisConstructor {
int id;
String name;

ThisConstructor(int id,String name){
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println("Id: "  +id+  " Name: "+name);
}
public static void main(String[] args) {
	ThisConstructor t= new ThisConstructor(102,"Shivani");
	t.display();
}
}
*/

package com.Skillio.constuctor;

public class ThisConstructor {

    int id;
    String name;

    // Default constructor
    ThisConstructor() {
        this(0, "Unknown");   // calls parameterized constructor
    }

    // Constructor with one parameter
    ThisConstructor(int id) {
        this(id, "Unknown");  // calls two-parameter constructor
    }

    // Constructor with two parameters
    ThisConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id: " + id + " Name: " + name);
    }

    public static void main(String[] args) {

        ThisConstructor t1 = new ThisConstructor();
        ThisConstructor t2 = new ThisConstructor(101);
        ThisConstructor t3 = new ThisConstructor(102, "Shivani");

        t1.display();
        t2.display();
        t3.display();
    }
}