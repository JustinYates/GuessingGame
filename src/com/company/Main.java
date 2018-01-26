package com.company;

import com.sun.tools.javac.tree.JCTree;

import java.util.Scanner;

// use this scanner for user input
public class Main {

    public static void main(String[] args) {

        //1. allow user input of a number (guess)
        //2. tell the user if their guess is too high or too low
        //3. Allow for 5 chances, if the number is'nt right tell them what it is
        //4. If the number is right congratulate them
        //5. Allow the user to play again if they,d like
        // Side Notes
        // > Is Greater than
        // < Is less Than
        // >= Greater than or equal to
        // <= Less than or equal to
        // != Not equal to
        // == Equal to
        // ! Is not
        // && And
        // || is or
        // 0 is counting as a first chance


        Scanner input = new Scanner(System.in);
        int numberOfGuesses = 0;
        while (numberOfGuesses < 5) {

            System.out.println("Enter Your Guess:");

            int userGuess = input.nextInt();

            int rNumber = (int) Math.ceil(Math.random() * 100);

            if (userGuess > rNumber) {

                System.out.println("Your number is too high, Try Again");
                numberOfGuesses++;

            } else if (userGuess < rNumber) {
                System.out.println("Your number is too low, try again");
                numberOfGuesses++;
            } else if (userGuess == rNumber)
                System.out.println("You have got it right");
            else if (numberOfGuesses == 5)
                System.out.print(rNumber);
        }

        System.out.println("YOU HAVE FAILED");
    }

}
