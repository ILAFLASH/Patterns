package com.patterns.creationalpatterns.abstractfactory.website;

import com.patterns.creationalpatterns.abstractfactory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer write python code...");
    }
}
