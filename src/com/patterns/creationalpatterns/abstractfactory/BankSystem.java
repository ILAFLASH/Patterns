package com.patterns.creationalpatterns.abstractfactory;

import com.patterns.creationalpatterns.abstractfactory.banking.BankingTeamFactory;

public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Banking system creating...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
