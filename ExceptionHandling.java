package com.irfan.exceptionhandling;

public class ExceptionHandling {
        public static void main(String args[]){
            try{
                int data=100/0;
            }catch(ArithmeticException e){System.out.println(e);}

            System.out.println("Codeee....");
        }
    }

