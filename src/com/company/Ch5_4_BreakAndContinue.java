package com.company;

public class Ch5_4_BreakAndContinue {
    public static void main(String[] args) {
        //Break and Continue using loops
        for (int i=0; i<3;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }System.out.println("Loop ends here");

        System.out.println(" ");
        int j=0;
        while (j<3){
            System.out.println(j);
            System.out.println("Java is great");
            if (j==2){
                System.out.println("Ending the loop");
                break;
            }j++;
        }System.out.println("Loop ends here");

        int k=0;
        System.out.println(" ");
        do {
            System.out.println(k);
            System.out.println("Java is great");
            if (k==2){
                System.out.println("Ending the loop");
                break;
            }
            k++;
        }while (k<3);
        System.out.println("Loop ends here");

        //Continue
        System.out.println(" ");
        for (int l=0; l<3;l++){
            if (l==2){
                System.out.println("Continuing the loop");
                continue; //gives control to the next iteration
            }
            System.out.println(l);
            System.out.println("Java is great");
        }

        int m=0;
        System.out.println(" ");
        do {
            m++;
            if (m==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(k);
            System.out.println("Java is great");
        }while (m<3);
        System.out.println("Loop ends here");
    }
}
