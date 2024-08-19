//Dynamic method dispatch - process of selecting and invoking the appropriate method at run time rather than compile time
package com.company;
class Phone {
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class SmartPhone extends Phone {
    public void music(){
        System.out.println("Music is playing");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class Ch10_6_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone phn = new Phone();//Allowed
        phn.on();
        SmartPhone sphn= new SmartPhone();//Allowed
        sphn.on();
        System.out.println("----\n");

        //Super obj= new SubClass();
        Phone obj1= new SmartPhone(); //Reference of super class and object of subclass is allowed
//        SmartPhone obj2= new Phone();//Not allowed
        obj1.showTime();
        obj1.on();
//        obj1.music(); //Not allowed
    }

}
