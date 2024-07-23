package com.company;

import java.util.Scanner;
public class Ch1_5_PracticeSets {
// Ch-1 Practice set
//1. Write a program to sum three numbers in java
//2. Write a program to find GPA using marks of three subjects
//3. Write a java program that asks a user its name and print hello <name>, have a good day
//4. Write a java program to convert kilometers to miles
//5. Write a java program to detect whether  a number entered by the user is integer or not

        public static void main(String[] args) {
            //Q1
            int a=4;
            int b=3;
            int c=9;
            int sum= a+b+c;
            System.out.println(sum);

            //Q2
            //int subject1= 45;
            float subject1= 45;// We donot use int because we want the result in float; as if we do operations in two integers then we will get a int onl
            float subject2= 95;
            float subject3 = 48;
            float cgpa = (subject1+subject2+subject3)/30f;
            System.out.println(cgpa);

            //Q3
            System.out.println("What is your name?");
            Scanner sc= new Scanner(System.in);
            String name = sc.next();
            System.out.println("Hello " + name + " have a good day");

            //Q4
            System.out.println("Enter the distance in kilometers");
            Scanner sc1= new Scanner(System.in);
            double distanceKM = sc1.nextDouble();
            double distanceMILES = distanceKM* (0.621371);
            System.out.println("The distance in miles is "+ distanceMILES);

            //Q5
            System.out.println("Enter your number");
            Scanner sc2= new Scanner(System.in);
            System.out.println(sc2.hasNextInt());
        }
    }

