package com.company;

public class Ch7_1_Methods {
    static int logic(int x, int y){
        //static is mandatory because you can only call a static method in psvm without object
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
        c= logic(a,b);

        int a1= 2;
        int b1= 1;
        int c1= logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
