package com.Skillio.String;

public class SpecialCharacter {
	
	    public static void main(String[] args) {

	        String str = "Java@123#Code!";

	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if(!(ch >= 'a' && ch <= 'z' || 
	                 ch >= 'A' && ch <= 'Z' || 
	                 ch >= '0' && ch <= '9')) {

	                System.out.print(ch + " ");
	            }
	        }
	    }
	}

