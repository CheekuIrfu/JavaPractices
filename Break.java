package com.irfan.control_statement;

public class Break {
    public static void main ( String [] args){
        for(int i = 0; i <= 9; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
