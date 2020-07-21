package com.patterns.structuralpatterns.facade;

public class Workflow {
    Work work = new Work();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solvingProblems() {
        work.doWork();
        bugTracker.startSprint();
        developer.doWorkBeforeDeadline(bugTracker);
    }
}
