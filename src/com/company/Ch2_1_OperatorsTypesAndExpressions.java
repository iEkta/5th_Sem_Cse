package com.company;

public class Ch2_1_OperatorsTypesAndExpressions {
// Operators
        public static void main (String[]args)
        {
            // 1. Arithmetic operator
            int a = 4;
            // int b= 6%a ; // modulo operator

            // 2. Assignment operator
            int b = 9;
            //b += 3;
            b *= 3;
            System.out.println (b);

            // 3. Comaparison Operator
            System.out.println (6 == 8);
            System.out.println (64 > 8);

            // 4. Logical Operator
            System.out.println (64 > 5 && 64 > 8);
            System.out.println (64 > 65 || 64 > 98);

            // 5. Bitwise Operator
            System.out.println (2 & 3);

            //    10
            //    11
            // -------and-----
            //    10

// 	4.8 % 1.1 ----> Returns decimal remainder

// Arithmetic Operators cannot work on boolean
// % Operators can work on floats and doubles also
        }
    }

