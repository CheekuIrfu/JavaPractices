package com.irfan.regex;

import java.util.regex.*;

public class Regex {
    public static void main(String args[]) {
        Pattern p = Pattern.compile(".s"); // Use Pattern.compile to create a regex pattern
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        boolean b3 = Pattern.matches(".s", "as"); // Use Pattern.matches for direct matching

        System.out.println(b + " " + b2 + " " + b3);
    }
}
