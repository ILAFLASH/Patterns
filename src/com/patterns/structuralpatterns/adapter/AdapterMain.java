package com.patterns.structuralpatterns.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }

}
