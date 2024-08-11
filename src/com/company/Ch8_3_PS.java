/*
    1. Create a class Employee with following properties:
        salary(property)(int)
        getSalary(method returning int)
        name(property)(String)
        getName(method returning String)
        setName(method returning name)
    2. Create a class cellphone with methods to print "ringing...", "vibrating...", etc.
    3. Create a class square with a method to initialize its side, calculating area, perimeter, etc.
    4. Create a class rectangle and repeat Q3.
    5. Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting), running, firing, etc.
    6. Repeat Q4 for a circle.
 */
package com.company;

class Employee1 {
    int salary;
    String name;
    String newName;
    public void printDetails(){
        System.out.printf("The name of the employee is %s\nand his/her salary is %d.\n",getName(),getSalary());
        System.out.printf("New name of the employee %s is %s\n\n",getName(),setName("Harry"));
    }
    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String newName){
        return newName;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Afiya...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    int radius;
    public float area(){
        return (3.14f)*radius*radius;
    }
    public float perimeter(){
        return 2*(3.14f)*radius;
    }
}
public class Ch8_3_PS {
    public static void main(String[] args) {
        //Q1
        Employee1 harry = new Employee1();
        harry.name = "Harish Khan";
        harry.salary = 500000;
        harry.setName("Harry");
        harry.printDetails();

        //Q2
        Cellphone motog54 = new Cellphone();
        motog54.callFriend();
        motog54.ring();
        motog54.vibrate();

        //Q3
        System.out.println();
        Square sq= new Square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //Q4
        System.out.println();
        Rectangle rt = new Rectangle();
        rt.length= 5;
        rt.breadth= 4;
        System.out.println(rt.area());
        System.out.println(rt.perimeter());

        //Q5
        System.out.println();
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.fire();
        player1.run();

        //Q6
        System.out.println();
        Circle c1= new Circle();
        c1.radius = 5;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
