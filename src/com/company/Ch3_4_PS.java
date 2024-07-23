package com.company;

public class Ch3_4_PS {
    // Ch=3 Practice Sets
//1. Write a java program to convert a string to lowercase
//2. Write a java program to replace spaces with underscores
/*3. Write a java program to fill in a letter template which looks like below:
     letter = "Dear <|name|>, Thanks a lot
     replace <|name|> with a string (some name) */
//4. Write a java program to detect double and triple spaces in a string
/*5. Write a java program to format the following letter using escape sequence characters
        letter = "Dear Harry, This course is nice. Thanks" */

        public static void main(String[] args) {
            //Q1
            String name = "Jack Parker";
            System.out.println(name.toLowerCase());

            //Q2
            String text = "I am Ekta";
            System.out.println(text.replace(' ', '_'));

            //Q3
            String letter = "Dear <|name|>, Thanks a lot!";
            System.out.println(letter.replace("<|name|>","Harry"));

            //Q4
            String myString = "This string contains  double and triple   spaces";
            System.out.println(myString.indexOf("  "));
            System.out.println(myString.indexOf("   "));

            //Q5
            String myLetter = "Dear Harry,\n\tThis Java course is nice.\n\tThanks!";
            System.out.println(myLetter);

        }

}
