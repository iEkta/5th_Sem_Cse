package com.company;

public class Ch6_3_MultidimensionalArray {
    public static void main(String[] args) {
        int [] marks; //A 1-D Array
        int [][] flats; //A 2-D Array
        flats = new int[2][3]; //2 rows and 3 cols
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;
        System.out.println("Printing a 2-D array using for loop");
        for (int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length; j++){ // first it runs for i=0 and then i=1
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
