package com.company;

public class Ch6_2_ForEachLoop {
    public static void main(String[] args) {
       /* float [] marks1 = {100.1f,78.7f,45.81f,67.89f,34.05f};
        String [] students = {"Harry","Rohan", "Shubham", "Ekta"};
        System.out.println(marks1[2]);
        System.out.println(students[2]);
        */

        int [] marks = {100,78,45,67,34};
        System.out.println(marks[2]);
        System.out.println(marks.length);

        //Display the array
        System.out.println("Printing using for loop");
        for (int i =0; i< marks.length; i++){
            System.out.println(marks[i]); //Array  traversall
        }
        System.out.println();

        //Quick Quiz: Display the array in reverse order
        System.out.println("Printing using for loop in reverse order");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println();

        //For each Loop
        System.out.println("Printing using for each loop");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
