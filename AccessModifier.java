package com.irfan.java_encapsulation;

public class AccessModifier {
    // Private field - accessible only within this class
    private String name;

    // Protected field - accessible within the same package and subclasses
    protected int age;

    // Public field - accessible from anywhere
    public String address;

    // Public constructor
    public AccessModifier(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Private method - accessible only within this class
    private String getName() {
        return name;
    }

    // Protected method - accessible within the same package and subclasses
    protected int getAge() {
        return age;
    }

    // Public method - accessible from anywhere
    public String getAddress() {
        return address;
    }

    // Public method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
}
