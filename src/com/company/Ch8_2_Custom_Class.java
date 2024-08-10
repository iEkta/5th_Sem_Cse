package com.company;
/* Any real world object = Properties + Behaviour
   Object in OOPS        = Attributes + Methods
*/
// One java file can have only one public file
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){ // A method
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Ch8_2_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry= new Employee(); //Instantiating a new Employee object
        Employee john = new Employee();

        //Setting attributes for Harry
        harry.id= 12;
        harry.name = "CodeWithHarry";
        harry.salary = 34000;

        //Setting attributes for John
        john.id = 17;
        john.name = "John Cena";
        john.salary= 24999;

        //Printing the attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        System.out.println(harry.getSalary());
    }
}
