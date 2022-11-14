package com.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args){
        isValidName();
    }

    private static void isValidName() {
        System.out.println("======================================= UC1 ===========================");
        list.add("Harry");
        String regex="[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<list.size();i++){
            Matcher matcher=pattern.matcher((list.get(i)));
            System.out.println("the first name is : ");
            System.out.println(list.get(i)+ " -> "+matcher.matches());
        }
    }

}
