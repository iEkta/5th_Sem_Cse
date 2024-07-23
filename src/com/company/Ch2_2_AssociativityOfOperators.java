package com.company;

public class Ch2_2_AssociativityOfOperators {
//  Associativity of operators in java

// Bodmas does not work in java. Associativity and precedance work on it.

        public static void main (String[]args)
        {
            // Precedence and Associativity
            int a = 6 * 5 - 34 / 2;
	/*
	   Highest Precedence goes to * and /. They are then evaluated on the basis of left to right Associativity
	   30 - 34/2
	   =30-17
	   =13
	 */
            int b = 60 / 5 - 34 * 2;
	/*
	   12- 68
	   = -56
	 */
            System.out.println (a);
            System.out.println (b);

            //Quick Quiz
            int x = 6;
            int y = 1;
            //int k= x*y/2;

            int d = 1;
            int e = 4;
            int f = 5;
            int k = d * d -( 4 * e * f )/ (2 * e);
            System.out.println (k);
        }
    }

