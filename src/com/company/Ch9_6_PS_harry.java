/*
    1. Create a class Cylinder and use getter and setters to set its radius and height
    2. Use Q1 to calculate surface area and volume of the cylinder
    3. Use a constructor and repeat Q1
    4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
    5. Repeat Q1 for a sphere
    6.
 */
package com.company;

class Cylinder1{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
class Rectangle2 {
    private int length;
    private int breadth;

    public Rectangle2() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}
class Sphere1{
    private int radius;

    public Sphere1() {
        this.radius = 8;
    }

    public int getRadius() {
        return radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*radius*4/3;
    }
}
public class Ch9_6_PS_harry {
    public static void main(String[] args) {
        //Q1 & Q3
        Cylinder1 myCylinder = new Cylinder1(9,12);
//        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        //Q2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        //Q4
        Rectangle2 r = new Rectangle2();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        //Q5
        Sphere1 s= new Sphere1();
        System.out.println(s.surfaceArea());
        System.out.println(s.volume());
    }
}
