package com.xworkz.Stringapp;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
        System.out.println("Please enter some text");
        Scanner sc = new Scanner(System.in);                  

    String input = sc.nextLine();
        char[] letters = input.toCharArray();

    int count = 0;
   
    for (char c : letters) {
         switch (c) {
            case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
        break;
        default:
                // no count increment
        }

     }
          System.out.println("Number of vowels in String [" + input + "] is : " + count);
   }

}





