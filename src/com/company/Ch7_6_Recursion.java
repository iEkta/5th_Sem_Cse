package com.company;
import java.util.Scanner;

public class Ch7_6_Recursion {
    static int  factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    static int iterativeFact(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for ( int i=1; i<=n;i++){
                product= i*product;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The value of factorial "+n+" through recursion is: "+ factorial(n));
        System.out.println("The value of factorial "+ n+" iterative approach is :" + iterativeFact(n));
    }
}
