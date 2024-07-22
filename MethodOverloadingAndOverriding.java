package com.irfan.oops;

public class MethodOverloadingAndOverriding {
        public int add(int a, int b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            MethodOverloadingAndOverriding obj = new MethodOverloadingAndOverriding();

            System.out.println("Sum of 3 and 4: " + obj.add(3, 4)); // Calls int add(int a, int b)
            System.out.println("Sum of 2.5 and 3.5: " + obj.add(2.5, 3.5)); // Calls double add(double a, double b)
            System.out.println("Sum of 1, 2, and 3: " + obj.add(1, 2, 3)); // Calls int add(int a, int b, int c)
        }
    }
