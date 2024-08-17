/*
    Constructor- A member function used to initialize an object while creating it.

    1.Same Name as Class: The constructor must have the same name as the class in which it is defined.

    2.No Return Type: Constructors do not have a return type, not even void. They are not supposed to return any value.

    3.Automatic Invocation: Constructors are automatically called when an object of the class is created using the new keyword.

    4.Types of Constructors:
    Default Constructor: A constructor without parameters. If no constructor is defined, the compiler provides a default constructor.
    Parameterized Constructor: A constructor that accepts parameters. This allows you to pass data to the object at the time of creation.
 */
package com.company;

class MyMainEmployee {
    private int id; //private modifier can be accessed using methods
    private String name;

    public MyMainEmployee(){
        id=45;
        name= "Your-name-here";
    }
    public MyMainEmployee(String myName, int myId){
        id=myId;
        name= myName;
    }

    public String getName(){
        return name;
    }

    public  int getId(){
        return id;
    }
}

public class Ch9_3_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry= new MyMainEmployee("CodeWithHarry",49);
//        harry.setId(17);
//        harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
