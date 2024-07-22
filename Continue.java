package com.irfan.control_statement;

    public class Continue {
        public static void main ( String [] args){
            for(int i = 3; i <= 9; i++) {
                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

