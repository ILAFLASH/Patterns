package com.patterns.structuralpatterns.facade;

public class Developer {
    public void doWorkBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrhabr...");
        }
    }
}
