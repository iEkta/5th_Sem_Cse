/*
    When there are multiple constructors in the parent class, the constructor without any parameter is called from the child class.
    If we want to call the constructor with parameters from the parent class, we can use super keyword.
 */
package com.company;

class Base1{
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){ //Constructor overloading
        System.out.println("I am an overloaded constructor with value of x as:"+ x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(14);//makes the base class constructor with parameter run and not the default constructor i.e. without any parameter
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: "+y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child of Derived constructor with value of z as "+z);
    }
}
public class Ch10_3_Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base1 b= new Base1();
        Derived1 d = new Derived1();
        System.out.println("------------");
        //When a derived class is extended from the base class, the constructor of the base class is executed first followed by the derived class.
        //In case of overloading, derived class runs the base class constructor which is without any parameter by default
        Derived1 d2 = new Derived1(4,9);
        System.out.println("----");
        ChildOfDerived cd =new ChildOfDerived(); //runs constructors without any parameter
        System.out.println("-----");
        ChildOfDerived cd1 =new ChildOfDerived(12,13,15); //runs constructors with parameter
    }
}
