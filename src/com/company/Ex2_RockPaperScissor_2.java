package com.company;

import java.util.Scanner;
import java.util.Random;
public class Ex2_RockPaperScissor_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random= new Random();
        int computerInput = random.nextInt(1,4);
        System.out.println("Computer chose "+ computerInput +" so\n");
        if (userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput ==2 || userInput ==1 && computerInput== 0 || userInput==2 && computerInput==1) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer Win!");
        }
    }
}
