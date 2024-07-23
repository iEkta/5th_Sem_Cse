package com.company;

import java.util.Scanner;
public class Ch1_4_CBSEQuestion {
// Write a program to calculate percentage of a given student in cbse board exam. His marks from 5 subjects  must be taken as input from the keyboard.
      public static void main (String[]args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the marks of subject 1");
            int s1 = sc.nextInt();
            System.out.println("Enter the marks of subject 2");
            int s2 = sc.nextInt();
            System.out.println("Enter the marks of subject 3");
            int s3 = sc.nextInt();
            System.out.println("Enter the marks of subject 4");
            int s4 = sc.nextInt();
            System.out.println("Enter the marks of subject 5");
            int s5 = sc.nextInt();
            float percentage=(s1+s2+s3+s4+s5)/5f;
            System.out.println("The percentage of the student is:");
            System.out.println(percentage+" %");
        }
    }

