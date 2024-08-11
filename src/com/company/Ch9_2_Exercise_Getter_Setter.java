/*
    Use getter and setter on a circle which sets its radius, area and perimeter and if area and perimeter is being set wrong then it will give warning.
 */
package com.company;

import java.awt.image.CropImageFilter;

class Circle1{
    private int radius;
    private float area;
    private float perimeter;
    public void setRadius(int r){
        if (r>0){
            radius = r ;
        }
        else {
            System.out.println("Radius must be greater than 0");
        }
    }
    public int getRadius(){
        return radius;
    }
    public float getArea(){
        return radius*radius*22/7.2f;
    }
    public float getPerimeter(){
        return 2*radius*22/7.2f;
    }
    public void setArea(float area) {
        if (Math.abs(area - getArea()) > 0.01) {
            System.out.println("Warning: The provided area does not match the calculated area.");
        } else {
            System.out.println("Area is correctly set.");
        }
    }

    public void setPerimeter(float perimeter) {
        if (Math.abs(perimeter - getPerimeter()) > 0.01) {
            System.out.println("Warning: The provided perimeter does not match the calculated perimeter.");
        } else {
            System.out.println("Perimeter is correctly set.");
        }
    }
}

public class Ch9_2_Exercise_Getter_Setter {
    public static void main(String[] args) {
        Circle1 c1= new Circle1();
        c1.setRadius(5);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        // Attempt to set area and perimeter with validation
        c1.setArea(78.5f);  // Should give a warning because the correct area is approximately 78.54
        c1.setPerimeter(31.4f);  // Should give a warning because the correct perimeter is approximately 31.42
    }
}
