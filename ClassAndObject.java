package com.irfan.oops;

    class Dog {

        String name;
        int age;

        void bark() {
            System.out.println(name + " is barking!");
        }
    }

    public class ClassAndObject {
        public static void main(String[] args) {

            Dog myDog = new Dog();

            myDog.name = "Buddy";
            myDog.age = 3;

            myDog.bark();
        }
    }

