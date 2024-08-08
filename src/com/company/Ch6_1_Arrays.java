package com.company;

public class Ch6_1_Arrays {
    public static void main(String[] args) {
        // Class of 500 students-- You have to store marks of these 500 students
        //There are three main ways to create an array in Java-

        // Below marks is reference, int is object
        //1. Declaration and then memory allocation
//        int [] marks;
//        marks = new int[5];

        //2. Declaration and memory allocation
        int [] marks = new int [5];
        //Initialisation
        marks[0]= 100;
        marks[1]= 68;
        marks[2]= 46;
        marks[3] = 76;
        marks[4] = 56;
        System.out.println(marks[4]);

        //3. Declaration, memory allocation and initialisation together
        int [] marks1 = {100,78,45,67,34};
        System.out.println(marks1[4]);
    }
}
//Array indices start from 0 and goes till (n-1) where n is the size of the array