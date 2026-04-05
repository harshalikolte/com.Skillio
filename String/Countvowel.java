package com.Skillio.String;

import java.util.Scanner;  

public class Countvowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            int count = 0;

            for(int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                switch(ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        count++;
                        break;
                }
            }

            System.out.println("Word: " + words[i] + " -> Vowels: " + count);
        }

        /*sc.close();*/
    }
}