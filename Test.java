package com.Skillio;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {

		        for(int line = 1; line <= 5; line++) {

		   
		            for(int space = 1; space <= 5- line; space++) {
		                System.out.print(" ");
					}
		            for(int ast = 1; ast <= 2 * line - 1; ast++) {

		                if(line == 1 || ast == 1 || ast== 2 * line - 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }

		            System.out.println();
		        }

		       
		        for(int line = 5- 1; line >= 1; line--) {

		           
		            for(int space = 1; space <= 5 - line; space++) {
		                System.out.print(" ");
		            }

		          
		            for(int ast = 1; ast<= 2 * line - 1; ast++) {

		                if(line == 1 || ast == 1 || ast == 2 * line - 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }

		            System.out.println();
		        }
		    }


}
	

