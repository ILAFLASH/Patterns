package com.patterns.structuralpatterns.adapter;

public interface Database {
    void insert();

    void update();

    void select();

    void remove();
}
