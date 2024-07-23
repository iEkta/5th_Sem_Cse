package com.company;

import java.util.Scanner;
public class Ch4_4_SwitchCase {
        public static void main(String[] args) {
            int age;
            System.out.println("Enter your age");
            Scanner sc = new Scanner(System.in);
            age= sc.nextInt();

            switch (age){
                case 18:
                    System.out.println("You are going to become an adult");
                    break;
                case 23:
                    System.out.println("You are going to join a job");
                    break;
                case 60:
                    System.out.println("You are going to get retired");
                default:
                    System.out.println("Enjoy your life");
            }
            System.out.println("Thanks for using my java code\n");

            char var = 'r';
            switch (var){
                case 'c':
                    System.out.println("You are going to become an adult");
                    break;
                case 'd':
                    System.out.println("You are going to join a job");
                    break;
                case 'r':
                    System.out.println("You are going to get retired");
                default:
                    System.out.println("Enjoy your life");
            }

        }
}
