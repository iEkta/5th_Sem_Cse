package com.company;

public class Ch5_3_ForLoop {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        //Write a program to print first n natural numbers using for loop
        for (int n=0; n<=15; n++){
            if (n%2!=0){
                System.out.println(n);
            }
        }

        //OR
        System.out.println(" ");
        int m=5;
        for (int j=0; j<=m; j++){
            System.out.println(2*j+1);
        }

        // Decrementing For Loop
        System.out.println(" ");
        for (int k=5; k>0; k--){
            System.out.println(k);
        }

        //Write a program to print first n natural numbers in reverse order
        System.out.println(" ");
        for (int l=5; l>0; l--){
            System.out.println(l);
        }
    }
}
