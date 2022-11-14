package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args){
        isValidFirstName();
        isValidSecondName();
    }

    private static void isValidFirstName() {
        System.out.println("======================================= UC1 ===========================");
        boolean result = isNameValid("Harry");
        System.out.println("\nthe first name is =====>>>>>  "+result);
    }
    private static void isValidSecondName() {
        System.out.println("\n======================================= UC2 ===========================");
        boolean result = isNameValid("Potter");
        System.out.println("\nthe second name is =====>>>>>  "+result);
    }
    private static boolean isNameValid(String name){
        boolean result=false;
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<name.length();i++){
            Matcher matcher=pattern.matcher(name);
            result=matcher.matches();

        }



        return result;
    }

}
