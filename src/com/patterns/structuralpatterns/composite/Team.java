package com.patterns.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team create project... \n");
        for(Developer developer : developers) {
            developer.writeCode();
        }
    }
}
