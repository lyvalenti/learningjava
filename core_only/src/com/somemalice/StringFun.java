package com.somemalice;

public class StringFun {

    public static void main(String[] args) {

    }

    public static String reverseString(String myString) {
        String returnString ="";
        String someName = myString;
//        System.out.println(someName);
        int stringIndex = myString.length()-1;
        while (stringIndex > -1) {
            char currentChar = someName.charAt(stringIndex);
            stringIndex = stringIndex - 1;
            returnString = returnString + currentChar;
        }
        return returnString;
    }
}
