package com.patterns.creationalpatterns.factorymethod;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
