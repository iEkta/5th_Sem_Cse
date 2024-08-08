//Write a java program to make a game of rock, paper and scissor
package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Ex2_RockPaperScissor {
    public static void main(String[] args) {

    Random rand = new Random();
    int sign = rand.nextInt(1,4);
    String CompInput;
    if( sign ==1){
        CompInput = "Rock";
    }
    else if( sign == 2){
        CompInput = "Paper";
    }
    else {
        CompInput = "Scissors";
    }
//    System.out.println("The computer chose "+ CompInput);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your choice (Rock/ Paper or Scissors)");
    String inputSign = sc.nextLine();

    if(sign ==1){
        if (inputSign.equals("Scissors")){
            System.out.println("You lose");
        } else if (inputSign.equals("Paper")) {
            System.out.println("You win");
        }
        else{
            System.out.println("It's a tie");
        }
    }
    else if (sign==2) {
        if (inputSign.equals("Scissors")){
            System.out.println("You win");
        } else if (inputSign.equals("Paper")) {
            System.out.println("It's a tie");
        }
        else{
            System.out.println("You lose");
        }
    }
    else {
        if (inputSign.equals("Scissors")){
            System.out.println("It's a tie");
        } else if (inputSign.equals("Paper")) {
            System.out.println("You lose");
        }
        else{
            System.out.println("You Win");
        }
    }
    }
    }
