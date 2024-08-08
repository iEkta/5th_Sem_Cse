package com.company;

/*Method overloading cannot be performed by changing the return type of methods
 eg- static void f(a,b)
     static int f(a,b)
     Both are same methods*/
public class Ch7_4_Method_overloading {
    static void foo(){
        System.out.println("Good Morning bro");
    }
    static void foo(int a ){ //parameterized (a is a parameter)
        System.out.println("Good Morning "+ a+ " bro");
    }
    static void foo(int a, int b){ //parameterized (a is a parameter).
        System.out.println("Good Morning "+ a+ " bro");
        System.out.println("Good Morning "+ b+ " bro");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);  //Arguments are actual
        foo(3000, 4000);// 3000 and 4000 are arguments
    }
}
