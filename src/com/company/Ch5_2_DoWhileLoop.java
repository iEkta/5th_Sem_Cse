package com.company;

public class Ch5_2_DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a<5);

        int b = 10;
        do {
            System.out.println("\n" +b+"\n");
            b++;
        }while (b<5);

        //Write a program to print first n natural numbers using do-while loop.
        int n= 0;
        do {
            System.out.println(n);
            n++;
        }while (n<=45);
    }
}
