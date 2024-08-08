package com.company;

/* 1. Write a program to print the pattern.
    ****
    ***
    **
    *

    2. Write a program to sum first n even numbers using while loop;
    3. Write a program to print multiplication  table of a given number n
    4. Write a program to print multiplication  table of 10 in reverse order.
    5. Write a program to find factorial of a given number using for loop.
    6. Repeat 5 using while loop.
    7. Repeat 1 using for/while loop.
    8. What can be done using one type of loop can also be done using the other two types of loops.
    -->True
    9. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
    10. A do while loop is executed--
            at least once
    */
public class Ch5_5_PS
{
    public static void main (String[]args)
    {
        //Q1
        for (int i = 4; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print ("*");
            }
            System.out.println ();
        }

        //Q2
        int a = 0;
        int sum = 0;
        int n = 15;
        while (a < n)
        {
            sum = sum + (2 * a);
            a++;
        }
        System.out.println ("\n"+sum);


        //Q3
        System.out.println();
        int m=10;
        for (int b=1; b<11 ; b++ ){
            System.out.printf("%d x %d = %d\n",m,b,m*b);
        }

        //Q4
        System.out.println();
        for (int c=10; c>0 ;c-- ){
            System.out.printf( "%d x %d = %d\n",m,c,m*c);
        }

        //Q5
        System.out.println();
        int fact=1;
        for ( int d =5;d>0 ;d-- ){
            fact = fact * d;
        }
        int d =5;
        System.out.printf("The factorial of %d is %d\n", d, fact);
        System.out.println("The factorial of 5 is "+ fact);

        //Q6
        System.out.println();
        int e=1;
        while(e<5){
            System.out.println("5");
            e++;
        }

        //Q7
        System.out.println();
        int f=1;
        while(f<5){
            System.out.println("1");
            f++;
        }

        //Q9
        System.out.println();
        int sum1= 0;
        for (int g=1; g<11; g++ ){
            sum1= sum1 + g*m;
        }
        System.out.println("The sum of numbers occurring in the multiplication table of 10 is "+sum1);
    }
}