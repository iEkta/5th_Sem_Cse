/*
    If a child class implements the same method present in the parent class again, it is known as method overriding
    i.e. redefining method of super class in subclass
 */
package com.company;

class A{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){//Method overriding
        System.out.println("I am method2 of class B");
    }
    public void meth3(){
        System.out.println("I am method3 of class B");
    }
}
public class Ch10_5_Method_Overriding {
    public static void main(String[] args) {
        A a= new A();
        a.meth2();

        B b= new B();
        b.meth3();
        b.meth2();
    }
}
