package com.irfan.oops;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("First argument is: " + args[0]);
        } else {
            System.out.println("No command lines.");
        }
    }
}
