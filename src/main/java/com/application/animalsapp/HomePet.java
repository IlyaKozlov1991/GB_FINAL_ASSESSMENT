package com.application.animalsapp;

public class HomePet extends  Animal{
    int Age;
    String Commands;

    public HomePet(String NAME, int AGE, String COMMANDS) {
        super(NAME);
        this.Age = AGE;
        this.Commands = COMMANDS;
    }

    public int getAge() {
        return Age;
    }

    public String getCommands() {
        return Commands;
    }
}
