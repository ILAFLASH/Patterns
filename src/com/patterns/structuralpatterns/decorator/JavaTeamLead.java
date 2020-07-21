package com.patterns.structuralpatterns.decorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeReport() {
        return " Make report for customer...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
