package com.application.animalsapp;

public class Counter extends Throwable {
    int val;

    public Counter() {}

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void add() {
        val += 1;
    }

}
