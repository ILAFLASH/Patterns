package com.patterns.creationalpatterns.abstractfactory;

import com.patterns.creationalpatterns.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Auction site creating...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
