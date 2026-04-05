package com.Skillio.constuctor;

public class Book {
String Title;
String Author;
Book(String Title,String Author){
this.Title=Title;
this. Author=Author;
}
void display() {
System.out.println("Book Title:" +Title);	
System.out.println("Book Author:" +Author);	
}
public static void main (String[] args) {
Book b= new Book("Java Programming","James Gosling");
b.display();
}
}