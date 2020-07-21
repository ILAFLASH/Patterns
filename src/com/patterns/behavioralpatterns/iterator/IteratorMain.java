package com.patterns.behavioralpatterns.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "Postgresql"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Mike Mayers", skills);

        Iterator iterator = javaDeveloper.gerIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
