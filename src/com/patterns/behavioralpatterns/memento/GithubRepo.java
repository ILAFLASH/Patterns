package com.patterns.behavioralpatterns.memento;

public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}