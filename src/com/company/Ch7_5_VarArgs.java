package com.company;
//More than one argument can be given to a function
public class Ch7_5_VarArgs {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a, int b,int d) {
//        return a + b+ d;
//    }
//    static int sum(int ...arr){ // accept and pack all the arguments being given to an array
        //Available as int []arr
       static int sum(int x, int ...arr){ //Now we definitely need 1 argument
        int result=0;
        for (int a:arr){
            result +=a;
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorial");
        System.out.println("The sum of 4 and 5 is "+ sum(4,5));
        System.out.println("The sum of 4,3 and 5 is "+ sum(4,3,5));
//        System.out.println("The sum of nothing is "+ sum()); //here arr will be an empty array so it will return 0
    }
}
