package com.company;

public class Ch3_3_StringMethods {
// String Methods

        public static void main(String[] args) {
            String name = "Harry";
            System.out.println(name);

            int value = name.length();
            System.out.println(value);

            String lstring = name.toLowerCase();
            System.out.println(lstring);

            String ustring = name.toUpperCase();
            System.out.println(ustring);

            String nonTrimmedString = "    Harry  ";
            System.out.println(nonTrimmedString);
            System.out.println(nonTrimmedString.trim());

            System.out.println(name.substring(3)); //starts from 3rd index
            System.out.println(name.substring(2,4)); //starts from 2nd index to 3rd

            System.out.println(name.replace('r','p'));
            System.out.println(name.replace("rry", "ir")); //string so double invereted comma

            System.out.println(name.startsWith("Har"));
            System.out.println(name.startsWith("bar"));

            System.out.println(name.endsWith("ry"));
            System.out.println(name.endsWith("oy"));

            System.out.println(name.charAt(1));

            System.out.println(name.indexOf("ry"));

            String modifiedName = "Harryrry";
            System.out.println(modifiedName.indexOf("rry"));
            System.out.println(modifiedName.indexOf("ry9")); //returns -1 when there's no match
            System.out.println(modifiedName.indexOf("rry", 4));

            System.out.println(modifiedName.lastIndexOf("rry"));
            System.out.println(modifiedName.lastIndexOf("rry", 4));

            System.out.println(name.equals("harry"));
            System.out.println(name.equalsIgnoreCase("harry"));

            //Escape Sequence Characters
            // -- Characters after backslash '\'
            // It consists of more than one Character but represents one Character when used within the Strings.
            // Eg- \n, \t, \', \\, etc.

            System.out.println("I am double quote\" and backslash \\ and a new line \n with a \t tab");

        }

}
