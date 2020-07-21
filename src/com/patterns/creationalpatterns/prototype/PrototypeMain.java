package com.patterns.creationalpatterns.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Project master = new Project(1, "MainProject", "Source code");
        System.out.println(master);

        System.out.println();

        ProjectFactory projectFactory = new ProjectFactory(master);
        System.out.println(projectFactory.copyProject());
    }
}
