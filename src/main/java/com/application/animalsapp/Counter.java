package com.application.animalsapp;

public class Counter {
    int val;

    public Counter() {}

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void incrementCounter() {
        val += 1;
    }

}
