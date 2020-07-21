package com.patterns.creationalpatterns.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("python");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality == "java") {
            return new JavaDeveloperFactory();
        } else if (speciality == "c++") {
            return new CppDeveloperFactory();
        } else if (speciality == "python") {
            return new PythonDeveloperFactory();
        } else throw new RuntimeException("No such speciality");
    }
}
