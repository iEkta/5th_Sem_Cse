/*
    Access Modifier - Specifies where a property/method is accessible.
    4 types-
    1. Private
    2. Default
    3. Protected
    4. Public
 */
package com.company;

class MyEmployee{
    private int id; //private modifier can be accessed using methods
    private String name;

    public void setName(String n){
        name = n;
//        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id= i;
//        this.id= i;
    }
    public  int getId(){
        return id;
    }
}
public class Ch9_1_AccessModifier_Getter_Setter {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name= "Harish Khan"; -> Throws an error due to private access modifier
        harry.setName("Harish Khan");
        System.out.println(harry.getName());
        harry.setId(45);
        System.out.println(harry.getId());
    }
}
