package com.irfan.java_abstraction;

public class AbIn {
    // Define an interface with several abstract methods
    interface A {
        void a();
        void b();
        void c();
        void d();
    }

    abstract static class B implements A {
        public void c() {
            System.out.println("I am C");
        }
    }

    static class M extends B {
        public void a() {
            System.out.println("I am A");
        }

        public void b() {
            System.out.println("I am B");
        }

        public void d() {
            System.out.println("I am D");
        }
    }

    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
