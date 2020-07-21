package com.patterns.creationalpatterns.abstractfactory.website;

import com.patterns.creationalpatterns.abstractfactory.Developer;
import com.patterns.creationalpatterns.abstractfactory.ProjectManager;
import com.patterns.creationalpatterns.abstractfactory.ProjectTeamFactory;
import com.patterns.creationalpatterns.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsiteProjectManager();
    }
}
