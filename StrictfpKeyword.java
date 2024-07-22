package com.irfan.oops;

public abstract class StrictfpKeyword {
    abstract class B {
        abstract void m(); // No 'strictfp' here, since abstract methods cannot have modifiers like 'strictfp'
    }
}
