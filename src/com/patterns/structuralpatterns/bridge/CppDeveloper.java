package com.patterns.structuralpatterns.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer write cpp code...");
    }
}
