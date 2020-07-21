package com.patterns.structuralpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        DeveloperFactoy developerFactoy = new DeveloperFactoy();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactoy.getDeveloperBySpeciality("java"));
        developers.add(developerFactoy.getDeveloperBySpeciality("java"));
        developers.add(developerFactoy.getDeveloperBySpeciality("java"));
        developers.add(developerFactoy.getDeveloperBySpeciality("java"));

        developers.add(developerFactoy.getDeveloperBySpeciality("c++"));
        developers.add(developerFactoy.getDeveloperBySpeciality("c++"));
        developers.add(developerFactoy.getDeveloperBySpeciality("c++"));
        developers.add(developerFactoy.getDeveloperBySpeciality("c++"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
