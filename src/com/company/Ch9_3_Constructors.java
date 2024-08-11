/*
    Constructor- A member function used to initialize an object while creating it.
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
