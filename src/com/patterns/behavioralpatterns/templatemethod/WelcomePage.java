package com.patterns.behavioralpatterns.templatemethod;

public class WelcomePage extends WebsiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
