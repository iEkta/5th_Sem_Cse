/*
    1. Write a java pgm to print the multiplication table of a number n
    2. Write pgm using functions to print the following pattern:
      *
      **
      ***
      ****
    3. Write a recursive function to calculate the sum of first n natural numbers
    4. Write a function to print the following pattern:
       ****
       ***
       **
       *
    5. Write a program to print the nth term of fibonacci.
    6. Write a function to find average of a set of numbers passed as arguments.
    7. Repeat Q4 using recursion.
    8. Repeat Q2 using recursion.
    9. Write a program to convert Celsius temperature to Fahrenheit.
    10. Repeat Q3 using iterative approach.
  */
package com.company;

public class Ch7_8_PS {
    //Q1
    static void Multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",n,i, n*i);
        }
        System.out.println();
    }

    //Q2
    static void pattern(int n){
        System.out.print("The pattern using iterative approach:");
        for (int i=0; i<=n; i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Q3
    static int Sum(int n){
        if(n==1){ //Base Condition
            return 1;
        }
        return n+Sum(n-1);
    }

    //Q4
    static void revPattern(int n){
        for (int i=n;i>=1;i--){
           for (int j=0;j<i;j++){
               System.out.print("*");
           }
            System.out.println( );
        }
    }

    //Q5
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    //Q6
    static void avg(int n,int ...arr){ //n is number of terms and arr is the elements
        int avg=0;
        for (int a:arr){
            avg+=a/n;
        }
//        return avg;
        System.out.println("\nAverage is: "+ avg);
    }

    //Q7
    static void revPattern_rec(int n){
        if(n>0){
            for (int i=n;i>=1;i--){
                System.out.print("*");
            }
            System.out.println( );
            revPattern_rec(n-1);
        }
    }

    //Q8
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for (int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    // pattern_rec(3)
    // pattern_rec(2) + 3 times star and new line
    // pattern_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern_rec(0) + 1 times star and new line +2 times star and new line + 3 times star and new line

    //Q9
    static void CelToFah(int n){
        float Fah= ((float) (n * 9) /5)+32f;
        System.out.printf("\n%d degree Celsius is %.2f degree Fahrenheit.\n", n, Fah);
    }

    //Q10
    static int Sum_itr(int n) {
        System.out.printf("\nThe sum of first %d numbers using iterative approach is ",n);
        int sum = 0;
        for (int k = 0; k <= n; k++) {
            sum = sum + k;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Q1
        Multiplication(7);

        //Q2
        pattern(4);

        //Q3
        System.out.printf("\nSum of first %d numbers is: %d\n", 5, Sum(5));

        //Q4
        System.out.println("\nThe reverse pattern using iterative approach:" );
        revPattern(4);

        //Q5
        System.out.println("\nThe fibonacci term at 7 index is:");
        System.out.println(fib(7));

        //Q6
        avg(5,1,5,67,34,23);

        //Q7
        System.out.println("\nReversed pattern using recurring is:");
        revPattern_rec(4);

        //Q8
        System.out.println("\nPattern using recurring:");
        pattern_rec(4);

        //Q9
        CelToFah(8);

        //Q10
        System.out.println(Sum_itr(5));
    }
}
