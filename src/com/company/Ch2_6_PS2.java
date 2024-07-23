package com.company;

public class Ch2_6_PS2 {
// Practice Set
// 2.Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade;

        public static void main(String[] args) {
            char grade = 'B';
            grade = (char)(grade +8);
            System.out.println(grade);

            // Decrypting the grade
            grade = (char)(grade-8);
            System.out.println(grade);
        }

}
