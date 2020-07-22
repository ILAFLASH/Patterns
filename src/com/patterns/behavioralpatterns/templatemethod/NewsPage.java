package com.patterns.behavioralpatterns.templatemethod;

public class NewsPage extends WebsiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
