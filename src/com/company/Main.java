package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbreader = new Scanner(System.in);
        System.out.println("Enter the word or phrase you would like encrypted.");
        String encrypt = kbreader.next();

        Encrypt word = new Encrypt(encrypt);


        System.out.println("Your encrytped word is: " + en.Encrypting());
       /* System.out.println("Please select a password.");
        String pword = kbreader.next();

        System.out.println("Would you like to decrypt your word");
        String
        if ()
        System.out.println("Please enter your password.");
        String enter = kbreader.next();

        if (pword == enter) {

        }*/

    }
}
