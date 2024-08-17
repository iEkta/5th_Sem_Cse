/*
    Create a class Game, which allows a user to play "Guess the number"
    game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect the number entered by the user is true
    4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(), etc to get this task done.
 */
package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int input;
    private int randomNo;
    private int guesses =0;
//    private boolean isCorrectNo=false;

    //Constructor to generate the random no
    public Game(){
        generateRandomNo();
    }

    //Method to generate a random no between 1 and 100
    public void generateRandomNo() {
        Random rand= new Random();
        randomNo= rand.nextInt(1,100);
    }

    //Method to take user input
    public void takeUserInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number from 1 to 100:\n");
        input = sc.nextInt();
    }

    //Method to check if the guessed no is correct
    public boolean isCorrectNo(){
        guesses++;
        if (randomNo>input){
            System.out.println("Enter a larger no");
            return false;
        } else if (randomNo<input) {
            System.out.println("Enter a smaller no");
            return false;
        } else {
            System.out.println("You have guessed the correct no");
            return true;
        }
    }

    //Getter for the no of guesses
    public int getNoOfGuesses(){
        return guesses;
    }
}
public class Ch9_4_Ex3_GuessTheNumber {
    public static void main(String[] args) {
        //Create a new game1 object
        Game game1= new Game();

        //Main game1 loop
        boolean correctGuess= false;
        while (!correctGuess){
            game1.takeUserInput(); //Take user input
            correctGuess = game1.isCorrectNo(); //Check if the guess is correct
        }

        //Print the no of guesses taken
        System.out.printf("You guessed the correct no in %d no of guesses.%n",game1.getNoOfGuesses());
    }
}
