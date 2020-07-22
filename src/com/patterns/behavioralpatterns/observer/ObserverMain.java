package com.patterns.behavioralpatterns.observer;

public class ObserverMain {
    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("John Johnson");
        Observer secondSubscriber = new Subscriber("Edward Norton");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("Second java position");
    }
}
