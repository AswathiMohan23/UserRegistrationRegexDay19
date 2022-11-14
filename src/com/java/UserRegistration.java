package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args){
        isValidFirstName();
        isValidSecondName();
        isEmailValid();
    }

    private static void isValidFirstName() {
        System.out.println("\n\n========================================== UC1 ===============================================\n");
        boolean result = nameValidation("Harry");
        System.out.println("\nthe first name is =====>>>>>  "+result);
    }
    private static void isValidSecondName() {
        System.out.println("\n\n========================================== UC2 ===============================================\n");
        boolean result = nameValidation("Potter");
        System.out.println("\nthe second name is =====>>>>>  "+result);
    }
    private static boolean nameValidation(String name){
        boolean result=false;
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<name.length();i++){
            Matcher matcher=pattern.matcher(name);
            result=matcher.matches();
        }
        return result;
    }
    private static void isEmailValid(){
        System.out.println("\n\n========================================== UC3 ===============================================\n");
        boolean result = false;
        String email="abcd_123@gmail.com";
        String regex="^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<email.length();i++){
            Matcher matcher=pattern.matcher(email);
            result=matcher.matches();
        }
        System.out.println("The email is  =====>>>> "+result);

    }
}
