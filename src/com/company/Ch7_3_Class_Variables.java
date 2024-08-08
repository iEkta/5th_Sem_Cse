package com.company;

public class Ch7_3_Class_Variables { //void does ot return anything
    static  void  tellJoke() {
        //static associates a method of a given class with the class rather than an object
        System.out.println("I invented a new word!\n plagiarism");
    }
    //Case 1: Changing the integer
    static  void  change (int a){
        a = 98;
    }

    //Case 2. Changing the array
    static  void changeArr(int [] arr){
        arr[0]= 98;
    }

    public static void main(String[] args) {
        tellJoke();

        //Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is "+ x);
        //static void change will not be able to change the value since it has a COPY

        //Case 2. Changing the array
        int [] marks = {52,77,73,89,98,94};
//        marks[0]= 45;
        changeArr(marks); //In case of arrays, reference is passed, so it will change the value (same in the case of objects passing to methods)
//        System.out.println(marks);
    }
}
