package com.company;

public class Ch2_3_DatatypesOfExpressions_IncrementAndDecrement {
// Data type of expressions and Increment and Decrement operators

        public static void main (String[]args)
        {
            // int a = 45+4;

            byte x = 5;
            int y = 6;
            short z = 8;
            int a = y + z;
            float b = 6.54f + x;
            System.out.println (a);
            System.out.println (b);

            // Increment and Decrement operators
            int i = 56;
            int j = i++; //first j is assigned i(56) and then i is incremented
            int k = 67;
            int l = ++k; //first k is incremented them l is assigned k(68)
            System.out.println (i++);	//use(print) i and then increments it
            System.out.println (i);
            System.out.println (++i);	//first increments it and then use(prints) it
            System.out.println(i);
        }
    }

