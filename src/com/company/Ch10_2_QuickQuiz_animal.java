package com.company;

class Animal{
    public void speak(){
        System.out.println("I am an animal and I am speaking");
    }
    public void walk(){
        System.out.println("I am an animal andI am walking");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("I am a dog and I am barking");
    }
}

public class Ch10_2_QuickQuiz_animal {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.speak();
        a.walk();

        Dog d= new Dog();
        d.bark();
        d.walk();
        d.speak();
    }
}
