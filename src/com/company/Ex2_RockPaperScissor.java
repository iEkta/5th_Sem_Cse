//Write a java program to make a game of rock, paper and scissor
package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ex2_RockPaperScissor {
    public static void main(String[] args) {

        Random rand = new Random();
        int sign = rand.nextInt(1, 4);
        String CompInput;
        if (sign == 1) {
            CompInput = "Rock";
        } else if (sign == 2) {
            CompInput = "Paper";
        } else {
            CompInput = "Scissors";
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (Rock/ Paper or Scissors)");
        String inputSign = sc.nextLine().trim();

        System.out.printf("The computer chose %s so \n", CompInput);
//    if(sign ==1 ){
//        if (inputSign.equalsIgnoreCase("Scissors")){
//            System.out.println("You lose");
//        } else if (inputSign.equalsIgnoreCase("Paper")) {
//            System.out.println("You win");
//        }
//        else{
//            System.out.println("It's a tie");
//        }
//    }
//    else if (sign==2) {
//        if (inputSign.equalsIgnoreCase("Scissors")){
//            System.out.println("You win");
//        } else if (inputSign.equalsIgnoreCase("Paper")) {
//            System.out.println("It's a tie");
//        }
//        else{
//            System.out.println("You lose");
//        }
//    }
//    else {
//        if (inputSign.equalsIgnoreCase("Scissors")){
//            System.out.println("It's a tie");
//        } else if (inputSign.equalsIgnoreCase("Paper")) {
//            System.out.println("You lose");
//        }
//        else{
//            System.out.println("You Win");
//        }
//    }

        if (CompInput.equalsIgnoreCase( inputSign)) {
            System.out.println("It's a draw");
        }
        else if (sign == 1 && inputSign.equalsIgnoreCase("Paper") ||
                sign == 2 && inputSign.equalsIgnoreCase("Scissors") ||
                sign == 3 && inputSign.equalsIgnoreCase("Rock")) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

    }
}
