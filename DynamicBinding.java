package com.irfan.polymorphism;

    class DynamicBinding {
        void eat() {
            System.out.println("animal is eating...");
        }
    }

    class Dog extends DynamicBinding {
        void eat() {
            System.out.println("dog is eating...");
        }

        public static void main(String args[]) {
            DynamicBinding a = new Dog();
            a.eat();
        }
}