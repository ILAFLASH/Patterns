package com.patterns.creationalpatterns.abstractfactory.website;

import com.patterns.creationalpatterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester testing website...");
    }
}
