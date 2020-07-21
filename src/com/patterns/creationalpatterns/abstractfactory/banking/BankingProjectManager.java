package com.patterns.creationalpatterns.abstractfactory.banking;

import com.patterns.creationalpatterns.abstractfactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM managing project...");
    }
}
