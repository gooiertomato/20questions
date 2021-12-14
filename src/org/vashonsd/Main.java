package org.vashonsd;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
                int numberToGuess = rand.nextInt (100);
                int numberOfTries = 0;
                Scanner input = new Scanner(System.in);
                int guess;
                boolean win = false;

                while (win == false)    {

                    System.out.println("guess a number 1-100: ");
                    guess = input.nextInt();
                    numberOfTries++;

                    if (guess == numberToGuess)   {
                        win = true;
                    }
                    else if (guess < numberToGuess)  {
                        System.out.println("your guess is too low");
                    }
                    else if (guess > numberToGuess)  {
                        System.out.println("your guess is too high");
                    }
                }
                System.out.println("you won, nice job bro!");
                System.out.println("the number was " + numberToGuess);
                System.out.println("it took you "+ numberOfTries + " tries");

            }

        }

