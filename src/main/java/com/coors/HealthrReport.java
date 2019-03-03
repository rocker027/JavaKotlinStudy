package com.coors;

public class HealthrReport implements Report {
    @Override
    public void load() {
        System.out.println("HealthReport loading data");
    }

    @Override
    public void print() {
        System.out.println("HealthReport printing");
    }
}
