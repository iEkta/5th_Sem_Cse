package com.company;
import java.util.Scanner;

public class Ch7_7_Fibonacci_Series {
    static int Fibonacci(int n){
            if (n==0){
                return 0;
            }
            else if (n==1) {
                return 1;
            }
            else {
                return Fibonacci(n-1)+Fibonacci(n-2);
            }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of Fibonacci numbers to be printed");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci(n);
        System.out.println("Fibonacci series up to "+ n+" is: ");
        for (int i=0; i< n;i++){
            System.out.println(Fibonacci(i)+" ");
        }
    }
}
