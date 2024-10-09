/*
1. Create a class circle and use inheritance to create another class cylinder from it
2. Create a class rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible
3. Create methods for area and volume in Q1
4. Create methods for area and volume in Q2. Also create getters and setters
5. What is the order of constructor execution for the following inheritance hierarchy:
    Base-> Derived1-> Derived2
    Derived2 obj= new Derived2();
   Which constructor will be executed and in what order
   Ans:- Same order
 */
package com.company;

//Q1 & Q3
class Circle2{
    public int radius;

    Circle2(){
        System.out.println("I am non param constructor of Circle2");
    }
    Circle2(int r){
        System.out.println("I am circle2 parameterized constructor");
        this.radius= r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder2 extends Circle2{
    public int height;

//    public int getHeight() {
//        return height;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }

    Cylinder2(int r, int h){
        super(r);// runs the constructor of parent class(calling super class to set the radius of cylinder2 using the parameterized constructor)
        // If we hadn't used super then it would have run the circle constructor without any param
        //It was used to invoke parent class constructors
        System.out.println("I am Cylinder2 parameterized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

//Q2 & Q4
class Rectangle3{
    public int length;
    public int breadth;

    Rectangle3(int l, int b){ //constructor for initializing l and b
        System.out.println("I am Rectangle3 param constructor");
        this.length=l;
        this.breadth=b;
    }

    public double area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle3{
    public int height;

//    public int getHeight() {
//        return height;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }

    Cuboid (int l, int b, int h){ //cuboid constructor for using super keyword to call rect constructor and initialize h
        super(l,b);
        System.out.println("I am Cuboid param constructor");
        this.height=h;
    }
    public double volume(){
//        super(l,b);
        return this.length*this.breadth*this.height;
    }
}
public class Ch10_8_PS {
    public static void main(String[] args) {
       //Q1 & Q3
       Circle2 objC= new Circle2(12);
       Cylinder2 obj = new Cylinder2(12,4);
       System.out.println("Area of Circle is:"+ objC.area());
       System.out.println("Volume of Cylinder is :"+ obj.volume()+"\n");


       //Q2 & Q4
       Rectangle3 rec= new Rectangle3(4,5);
       Cuboid cub= new Cuboid(4,5,7);
       System.out.println("Area of the rectangle is "+ rec.area());
       System.out.println("Volume of the cuboid is "+ cub.volume());
    }
}
