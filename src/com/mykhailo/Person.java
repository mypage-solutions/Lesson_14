package com.mykhailo;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private double weight;

    public Person(String firstName, String lastName, int age, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "years" +
                ", height=" + height + "cm" +
                ", weight=" + weight + "kg" +
                '}';
    }
}
