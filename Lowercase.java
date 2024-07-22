package com.irfan.practice;

public class Lowercase {

    public static String toLowerCase(String s) {
        StringBuilder finalResult = new StringBuilder(s.length());


        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            finalResult.append(c);
        }
        return finalResult.toString();
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }
}


