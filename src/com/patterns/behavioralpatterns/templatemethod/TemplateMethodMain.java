package com.patterns.behavioralpatterns.templatemethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n====================================================");
        newsPage.showPage();
    }
}
