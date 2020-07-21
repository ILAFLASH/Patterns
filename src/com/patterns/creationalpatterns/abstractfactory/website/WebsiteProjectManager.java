package com.patterns.creationalpatterns.abstractfactory.website;

import com.patterns.creationalpatterns.abstractfactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager managing website...");
    }
}
