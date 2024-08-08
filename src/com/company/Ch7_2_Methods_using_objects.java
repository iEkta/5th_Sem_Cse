package com.company;

public class Ch7_2_Methods_using_objects {
     int logic(int x, int y){//Without static
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z= (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b=7;
        int c;
        //Method invocation using object creation
        Ch7_2_Methods_using_objects obj= new Ch7_2_Methods_using_objects();
        c= obj.logic(a,b);
        System.out.println("a:"+a+" "+"b:"+b);

        int a1= 2;
        int b1= 1;
        int c1= obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
