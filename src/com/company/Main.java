package com.company;

import java.util.Scanner;
// use this scanner for user input
public class Main {

    public static void main(String[] args) {

        //1. allow user input of a number (guess)
        //2. tell the user if their guess is too high or too low
        //3. Allow for 5 chances, if the number is'nt right tell them what it is
        //4. If the number is right congratulate them
        //5. Allow the user to play again if they,d like

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Guess:");
        int userGuess = input.nextInt();
    }
}
