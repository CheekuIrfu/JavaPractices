package com.irfan.polymorphism;

public class MethodOverloading {

        public int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {

            MethodOverloading example = new MethodOverloading();

            int sumInt = example.add(18, 17);
            System.out.println("Sum of numbers are : " + sumInt);
        }
    }

