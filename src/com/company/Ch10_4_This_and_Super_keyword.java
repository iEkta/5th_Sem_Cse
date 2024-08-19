/*
    * this is a way for us to reference an object of the class which is being created/referenced
    * super keyword is a reference variable used to refer immediate parent class object
        * It can be used to refer immediate parent class instance variable
        * It can be used to invoke parent class methods
        * It can be used to invoke parent class constructors
 */
package com.company;

import javax.print.Doc;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a; //we need to use this if our variable name is same
    }

    EkClass(int v){
//        a= v;
        this.a= v;
    }
    public int returnNone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class Ch10_4_This_and_Super_keyword {
    public static void main(String[] args) {
        EkClass e= new EkClass(65);
        System.out.println(e.getA());
        System.out.println("---");
        DoClass d= new DoClass('5');
        System.out.println(d.getA());
        
    }
}
