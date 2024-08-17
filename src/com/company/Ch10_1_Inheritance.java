/*
Inheritance is used to borrow properties and methods from an existing class

Derived class inherits parts of superclass methods and fields(some stuffs aren't inherited like private,etc.)

Java doesn't support multiple inheritance
   i.e. two classes cannot be superclass for a subclass
 */
package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

//extends keyword will make all the things available in Base available in Derived too
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Ch10_1_Inheritance {
    public static void main(String[] args) {
        //Creating an object of Base class
        Base b= new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of Derived class
        Derived d= new Derived();
        d.setX(4);
        System.out.println(d.getX());

        d.setY(43);
        System.out.println(d.getY());
    }
}
