package com.mykhailo;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
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
