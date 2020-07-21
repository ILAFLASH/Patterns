package com.patterns.structuralpatterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/realprogect");
        project.run();
    }
}
