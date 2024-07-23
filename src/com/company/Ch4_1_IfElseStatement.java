package com.company;

public class Ch4_1_IfElseStatement {
    //If else statement
// = is used for assignment and == and is used for equality check
        public static void main(String[] args) {
            int age = 26; //int age is assigned to 26
        /* if (age != 18) {
            System.out.println("Yes boy you can drive!");
        } */
            boolean cond= (age==18);
            if(cond){
                System.out.println("Yes boy you can drive");
            }
            else {
                System.out.println("No boy you cannot drive yet!");
            }
        }
}
