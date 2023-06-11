package com.application.animalsapp;

public class Counter {
    int val;

    public Counter(int val) {
        this.val = val;
    }

    public void add() {
        val += 1;
    }

    public String getVal() {
        String currentVal = "Текущее значение Счетчика: " + val;
        System.out.println(currentVal);
        return currentVal;
    }
}
