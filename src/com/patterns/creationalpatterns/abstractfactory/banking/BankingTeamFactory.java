package com.patterns.creationalpatterns.abstractfactory.banking;

import com.patterns.creationalpatterns.abstractfactory.Developer;
import com.patterns.creationalpatterns.abstractfactory.ProjectManager;
import com.patterns.creationalpatterns.abstractfactory.ProjectTeamFactory;
import com.patterns.creationalpatterns.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
