package com.coors;

public class Person {
    private String name ;
    private float weight;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void hello() {
        System.out.println("Hello world!!");
    }

    public float bmi() {
        return  weight / (height * height);
    }
}
