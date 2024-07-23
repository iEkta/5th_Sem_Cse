package com.company;

// Taking User Input
import java.util.Scanner;
class Ch1_3_GettingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter number 1");
        //  int a = sc.nextInt();
        //  System.out.println("Enter number 2");
        //  int b = sc.nextInt();
        //  int sum = a+b;
        //  System.out.println("The sum of these numbers is");
        //  System.out.println(sum);

        //-------------------------------

        //  System.out.println("Taking input from the user");
        //  boolean b1 = sc.hasNextInt();
        //  System.out.println(b1);

        //---------------------------
        //  System.out.println("Taking input from the user");
        String str = sc.nextLine();
        System.out.println(str);
    }
}