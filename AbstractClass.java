package com.irfan.java_abstraction;

abstract class AbstractClass {
    abstract void run();
}

class Honda4 extends AbstractClass{
    void run(){System.out.println("be aware..");}

    public static void main(String args[]){
        AbstractClass obj = new Honda4();
        obj.run();
}
}
