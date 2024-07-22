package com.irfan.java_encapsulation;

public class Encapsulation {
    // A class representing a Person
    public static class Person {
        // Private fields - encapsulating the data
        private String name;
        private int age;

        // Public constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Public method to get the name
        public String getName() {
            return name;
        }

        // Public method to set the name
        public void setName(String name) {
            this.name = name;
        }

        // Public method to get the age
        public int getAge() {
            return age;
        }

        // Public method to set the age
        public void setAge(int age) {
            if (age > 0) { // Validating the age before setting it
                this.age = age;
            }
        }

        // A method to display person details
        public void displayPersonInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Creating an object of the Person class
            Person person = new Person("Abd villiers", 25);

            // Accessing the person's details using getter methods
            System.out.println("Initial State:");
            person.displayPersonInfo();

            // Modifying the person's details using setter methods
            person.setName("Virat Kohli");
            person.setAge(30);

            // Displaying the updated person details
            System.out.println("\nUpdated State:");
            person.displayPersonInfo();
        }
    }
}
