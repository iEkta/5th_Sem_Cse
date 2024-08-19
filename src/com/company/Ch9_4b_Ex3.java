package com.company;
import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void Game(){
        Random rand= new Random();
        this.number= rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean isCorrectNumber(int num){
//        if (num == number) {
//            return true;
//        }
//        return false;
        return num == number;
    }
}
public class Ch9_4b_Ex3 {
    public static void main(String[] args) {
        Game g= new Game();
        g.takeUserInput();
    }
}
