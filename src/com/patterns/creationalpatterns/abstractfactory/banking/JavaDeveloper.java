package com.patterns.creationalpatterns.abstractfactory.banking;

import com.patterns.creationalpatterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write java code...");
    }
}
