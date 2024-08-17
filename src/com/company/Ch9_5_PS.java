/*
    1. Create a class Cylinder and use getter and setters to set its radius and height
    2. Use Q1 to calculate surface area and volume of the cylinder
    3. Use a constructor and repeat Q1
    4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
    5. Repeat Q1 for a sphere
    6.
 */
package com.company;

class Cylinder{
    //Q1
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    //Q2
    public float surfaceArea(){
        return 2*radius*height*22/7f;
    }
    public float volume(){
        return radius*radius*height*22/7f;
    }

    //Q3
    public Cylinder(){
        radius=3;
        height=8;
    }
}

//Q4
class Rectangle1 {
    private int rRadius;
    private int rHeight;

    public Rectangle1(){
        rRadius=8;
        rHeight=2;
    }
    public int getrRadius(){
        return rRadius;
    }
    public int getrHeight(){
        return rHeight;
    }
}

//Q5
class Sphere{
    private int sRadius;
    private int sHeight;
    public Sphere(){
        sRadius=6;
        sHeight=4;
    }
    public int getsRadius(){
        return sRadius;
    }
    public int getsHeight(){
        return sHeight;
    }
}
public class Ch9_5_PS {
    public static void main(String[] args) {
        Cylinder c1= new Cylinder();

        //Q1
//        c1.setRadius(5); //Preference is given to setter as compared to constructor
//        c1.setHeight(4);
//        System.out.printf("Radius of Cylinder is: %d\n",c1.getRadius());
//        System.out.printf("Radius of Cylinder is: %d\n",c1.getHeight());

        //Q2
        System.out.printf("The surface area of Cylinder is %f\n",c1.surfaceArea());
        System.out.printf("The volume of Cylinder is %f\n",c1.volume());

        //Q3
        System.out.printf("Radius of Cylinder is: %d\n",c1.getRadius());//in this case we don't need to set the height and radius before getting it. We can just use the getter
        System.out.printf("Radius of Cylinder is: %d\n",c1.getHeight());

        //Q4
        Rectangle1 r1= new Rectangle1();
        System.out.printf("Radius of Rectangle is: %d\n",r1.getrRadius());
        System.out.printf("Height of Rectangle is: %d\n",r1.getrHeight());

        //Q5
        Sphere s1= new Sphere();
        System.out.printf("Radius of Sphere is: %d\n",s1.getsRadius());
        System.out.printf("Height of Sphere is: %d\n",s1.getsHeight());
    }
}
