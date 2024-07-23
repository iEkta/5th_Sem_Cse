package com.company;

import java.util.Scanner;
public class Ch3_2_Strings {
// String

        public static void main(String[] args) {
            // String name = new String("Harry");
            String name = "Harry";
            System.out.print("The name is:"); // print doesnot give next line for the next print function
            System.out.println(name);

            int a =6;
            float b= 5.6454f;
            System.out.printf("The value of a is %d and the value of b is %.2f\n",a, b); //.2f gives two decimal places
            System.out.format("The value of a is %d and the value of b is %8.2f\n",a, b); //8.2f gives 8 spaces before decimal and two spaces after decimal

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the string: ");
            String st= sc.nextLine();
            System.out.println(st);
        }

}
