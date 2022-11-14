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
        isValidPhoneNumber();
        isValidPassword();
        removingTheAddedMailId();
    }

    private static void removingTheAddedMailId() {
        System.out.println("\n========================================== UC9 ===============================================\n");
        System.out.println("removing email : ");
        System.out.println("list after removing the added mail id : "+list);
    }


    private static void isValidFirstName() {
        System.out.println("\n========================================== UC1 ===============================================\n");
        boolean result = nameValidation("Harry");
        System.out.println("the first name is =====>>>>>  "+result);
    }
    private static void isValidSecondName() {
        System.out.println("\n\n========================================== UC2 ===============================================\n");
        boolean result = nameValidation("Potter");
        System.out.println("the second name is =====>>>>>  "+result);
    }
    private static boolean nameValidation(String name){
        boolean result=false;
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        result=matcher.matches();
        if(result==true)
            list.add(name);
        else
            list.add("-------------");
        return result;
    }
    private static void isEmailValid(){
        System.out.println("\n\n========================================== UC3 ===============================================\n");
        boolean result ;
        /*String email1="abc@yahoo.com";
        String email2="abc-100@yahoo.com";
        String email3="abc111@abc.com";
        String email4="abc.100@yahoo.com";
        String email5="abc-100@abc.net";
        String email6="abc.100@abc.com.au";
        String email7="abc@1.com";
        String email8="abc@gmail.com.com";
        String email9="abc+100@gmail.com";*/

        list.add("abc@yahoo.com");
        list.add("abc-100@yahoo.com");
        list.add("abc111@abc.com");
        list.add("abc.100@yahoo.com");
        list.add("abc-100@abc.net");
        list.add("abc.100@abc.com.au");
        list.add("abc@1.com");
        list.add("abc@gmail.com.com");
        list.add("abc+100@gmail.com");

        String regex="^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern=Pattern.compile(regex);
        for(int i=3;i<list.size();i++){
            Matcher matcher=pattern.matcher(list.get(i));
            result=matcher.matches();
            System.out.println("The email "+list.get(i)+" is  =====>>>> "+result);
        }
        for(int i=list.size()-1;i>1;i--){
            list.remove(i);
        }
    }




    private static void isValidPhoneNumber() {
        System.out.println("\n\n========================================== UC4 ===============================================\n");
        boolean result = false;
        String phoneNumber="91 9734567892";
        String regex="[91]+() +[789][0-9]{9}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phoneNumber);
        result=matcher.matches();
        if(result==true)
            list.add(phoneNumber);
        else
            list.add("-------------");
        System.out.println("The phone number is  =====>>>> "+result);

    }
    private static void isValidPassword() {
        System.out.println("\n\n====================================== UC5, UC6, UC7 & UC8 =====================================\n");
        boolean result = false;
        String password="aAbcd@#1234";

        //  (?=.*?[A-Z]) ---> atleast 1 uppercase;    (?=.*?[a-z]) ----> atleast 1 lower case;
        //  (?=.*?[0-9]) ----> atleast 1 digit;        (?=.*?[#?!@$%^&*-]) ----> atleast 1 special character

        String regex="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        result=matcher.matches();
        if(result==true)
            list.add(password);
        else
            list.add("-------------");
        System.out.println("The password is  =====>>>> "+result);
    }
    }




