package com.patterns.creationalpatterns.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    Project copyProject() {
        return (Project) project.copy();
    }
}
