package com.irfan.polymorphism;

    class Covariant{
        Covariant get(){return this;}
    }

    class B1 extends Covariant{
        B1 get(){return this;}
        void message(){System.out.println("Hi hello");}

        public static void main(String args[]){
            new B1().get().message();
        }
    }

