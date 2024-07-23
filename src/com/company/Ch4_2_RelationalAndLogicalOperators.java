package com.company;

public class Ch4_2_RelationalAndLogicalOperators {
        public static void main(String[] args) {
            System.out.println("For Logical AND....");
            boolean a= true;
            boolean b= false;
            //if (a==true && b==true)
            if (a && b ){
                System.out.println("Yes\n");
            }
            else {
                System.out.println("No\n");
            }

            System.out.println("For Logical OR....");
            boolean x= true;
            boolean y= false;
            if (x || y ){
                System.out.println("Yes\n");
            }
            else {
                System.out.println("No\n");
            }

            System.out.println("For Logical NOT....");
            boolean p= true;
            boolean q= false;
            System.out.println("Not(p) is ");
            System.out.println(!p );
            System.out.println("Not(q) is ");
            System.out.println((!q + "\n"));
        }
}
