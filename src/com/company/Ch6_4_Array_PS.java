/*
 1. Create an array of 5 floats and calculate their sum
 2. Write a program to find out whether a given integer is present in an array or not
 3. Calculate the average marks from an array containing marks of all students in physics using for each loop
 4. Create a java program to add two matrices of size 2X3
 5. Write a java program to reverse an array
 6. Write a java program to find the maximum element in an array
 7. Write a java program to find the minimum element in an array
 8. Write a java program to find whether an array is sorted or not
 */


package com.company;

import java.util.Arrays;

public class Ch6_4_Array_PS {
    public static void main(String[] args) {
        //Q1
        float[] marks = {45.7F, 67.8F, 56.7F, 34.6F, 100.0F};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is : " + sum);

        //Q2
        float num = 56.7f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break; //We used break bcz if find the element at index1 then we don't need to search the next elements
            }
        }
        if (isInArray) {
            System.out.println("\n The value is present in the array\n");
        } else {
            System.out.println("\n The value is not present in the array\n");
        }

        //Q3
        System.out.println("The value of average marks is : " + sum / marks.length + "\n");

        //Q4 Printing the elements of a 2d array
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9},
                {10, 11, 12}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
//                System.out.format("Setting value of i=%d and j=%d\n", i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
        //OR
//        for (int[] element: mat1){ //row no of times
//            for (int[] element2: mat2){ //col no of times
//            result [][]            }
//        }

        //Q5 Reversing an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("\n");

        //OR
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp1;
        for (int i = 0; i < n; i++) {
            temp1 = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp1;
        }
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.println("\n");

        //Q6. Max Element
        System.out.println(Arrays.stream(arr).max() + "\n");
        //OR
        int MaxElement = arr[0]; //Assuming 1st element is maximum initially
        for (int e : arr){
            if (e>MaxElement){
                MaxElement= e;
            }
        }
        System.out.println("Max element is :" + MaxElement);
        //OR
      for (int j : arr) {
            MaxElement = Math.max(MaxElement, j);
        }
        System.out.println("Max element is :" + MaxElement);

        //Q7. Min Element
        int MinElement = arr[0];
        for (int i : arr) {
            MinElement = Math.min(MinElement, i);
        }
        System.out.println("Min element is :" + MinElement);

        //Q8
        int SmallerElement = arr[0];
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (SmallerElement < arr[i]) {
                SmallerElement = arr[i];
            } else {
                sorted = false;
                break;
            }
        }
        if (!sorted) {// or sorted == false
            System.out.println("The array is not sorted");
        }else{
                System.out.println("The array is sorted");
        }
    }
}


