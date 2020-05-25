package com.testingjava.patterns.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality == "java") {
            return new JavaDeveloperFactory();
        } else if (speciality == "c++") {
            return new CppDeveloperFactory();
        } else if (speciality == "python") {
            return new PythonDeveloperFactory();
        } else throw new RuntimeException("No such speciality");
    }
}
