package com.irfan.oops;

public class JavaRecursion {
        static int count=0;
        static void p(){
            count++;
            if(count<=3){
                System.out.println("Hi "+count);
                p();
            }
        }
        public static void main(String[] args) {
            p();
        }
    }

