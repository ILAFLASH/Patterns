package com.patterns.creationalpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
//        director.setWebsiteBuilder(new VisitCardWebsiteBuilder());
        director.setWebsiteBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
