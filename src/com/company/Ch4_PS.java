// Practice Sets
/* 1.What will be the output of the program:
    int a= 10;
    if(a=11)
        System.out.println("I am 11")
    else
        System.out.println("I am not 11")
        */
//  2. Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user
/* Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        Income Tax      Tax%
        2.5l-5.0l       5%
        5.0l-10.0l      20%
        Above 10.0l     30%
        */
// 3. Write a java program to find out the day of the week given the number[1 for Monday, 2 for Tuesday,....so on]
// 4. Write a java program to find whether a year entered by the user is a leap year or not;
// 5. Write a java program to find out the type of website from the url.

package com.company;
import java.util.Scanner;
public class Ch4_PS
{
    public static void main(String[] args) {
// 		//Q1
// 		int a =10;
// 		if(a==11){
// 		    System.out.println("I am 11");
// 		}
// 		else
// 		    System.out.println("I am not 11");

// 		//Q2
// 		byte m1, m2, m3;
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter your marks in Physics");
// 		m1 = sc.nextByte();
// 		System.out.println("Enter your marks in Chemistry");
// 		m2 = sc.nextByte();
// 		System.out.println("Enter your marks in Mathematics");
// 		m3 = sc.nextByte();

// 		float avg= (m1+m2+m3)/3.0f;
// 		System.out.println("Your overall percentage is:" + avg);
// 		if(avg==40 && m1>33 &&  m2>33 && m3>33){
// 		    System.out.println("Congratulations, You have been promoted");
// 		}
// 		else{
// 		    System.out.println("Sorry, You have not been promoted. Please try again");
// 		}

// 		//Q3
// 		Scanner sc1 = new Scanner(System.in);
// 		System.out.println("Enter Your income in lakhs per annum");
// 		float tax = 0;
// 		float Income = sc1.nextFloat();

// 		if(Income<2.5){
// 		    tax = tax + 0;
// 		}
// 		else if(Income>2.5f && Income < 5f){
// 		    tax = tax + 0.05f *(Income-2.5f);
// 		}
// 		else if(Income>5f && Income < 10f){
// 		    tax = tax + 0.05f *(5.0f-2.5f);
// 		    tax = tax + 0.2f *(Income-5f);
// 		}
// 		else if(Income >10.0f){
// 		    tax = tax + 0.05f *(5.0f-2.5f);
// 		    tax = tax + 0.2f *(10.0f-5f);
// 		    tax = tax + 0.3f *(Income-10f);
// 		}

// 		System.out.println("The total tax paid by the employee is "+ tax);


        //Q4
// 	System.out.println("Enter the number for the day of the week");
// 	Scanner sc2= new Scanner(System.in);
// 	int day= sc2.nextInt();
// 	switch(day){
// 	    case 1 :
// 	        System.out.println("Monday");
// 	        break;
// 	    case 2 :
// 	        System.out.println("Tuesday");
// 	         break;
// 	    case 3 : System.out.println("Wednesday");
// 	         break;
// 	    case 4 :
// 	        System.out.println("Thursday");
// 	         break;
// 	    case 5 :
// 	        System.out.println("Friday");
// 	         break;
// 	    case 6 :
// 	        System.out.println("Saturday");
// 	         break;
// 	    case 7 :
// 	        System.out.println("Sunday");
// 	         break;
// 	}

        //Q5
        System.out.println("Enter the year");
        Scanner sc3= new Scanner(System.in);
        int year = sc3.nextInt();

        if( year%4==0 && year%100!=0){
            System.out.println(year + " is a leap year.");
        }
        else if(year%100==0 && year%400==0 ){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year +" is not a leap year");
        }

        // //Q6
        // System.out.println("Enter the website name");
        // Scanner sc4= new Scanner(System.in);
        // String website = sc4.next();

        // if(website.endsWith(".org")){
        //     System.out.println("This is an organisational website");
        // }
        // else if(website.endsWith(".com")){
        //     System.out.println("This is a commercial website");
        // }
        // else if(website.endsWith(".in")){
        //     System.out.println("This is an Indian website");
        // }
    }
}