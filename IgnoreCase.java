package com.irfan.String;

public class IgnoreCase {
    public static void main(String[] args){
        String s1 = "Virat";
        String s2 = "VIRAT";
        String s3 = "MAHi";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s3.equalsIgnoreCase(s1));
    }
}
