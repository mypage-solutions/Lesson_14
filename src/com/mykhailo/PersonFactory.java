package com.mykhailo;

import java.util.*;

public class PersonFactory {

    public static final Random RANDOM = new Random();
    public static final String[] FIRST_NAME = {"Jack", "James", "Noah", "Daniel", "Conor", "Finn", "Harry", "Charlie"};
    public static final String[] LAST_NAME = {"Duffy", "Brown", "Ryan", "Lynch", "Collins", "Quinn", "Walsh", "Connor"};

    private final List<Person> persons = new ArrayList<>();

    public void addPersons(int number) {

        for (int i = 0; i < number; i++) {
            String firstName = FIRST_NAME[RANDOM.nextInt(FIRST_NAME.length)];
            String lastName = LAST_NAME[RANDOM.nextInt(LAST_NAME.length)];
            int age = RANDOM.nextInt(46) + 20;
            int height = RANDOM.nextInt(51) + 150;
            //  The formula is BMI = kg/m2 where kg is a person's weight in kilograms and m2 is their height in metres squared.
            //  A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9.
            int bmi = RANDOM.nextInt(13) + 18;
            double weight = Math.round(Math.pow(height / 100d, 2) * bmi * 100) / 100d;
            Person person = new Person(firstName, lastName, age, height, weight);
            persons.add(person);
        }
    }

    public List<Person> removeDuplicates(List<Person> list) {
        Set<Person> temp = new HashSet<>(list);
        return new ArrayList<>(temp);
    }

    public static void main(String[] args) {

        PersonFactory personList = new PersonFactory();
        personList.addPersons(100);
        System.out.println(personList.persons);
        List<Person> listWithoutDuplicates = personList.removeDuplicates(personList.persons);
        System.out.println(listWithoutDuplicates);
        System.out.println("Original list size: " + personList.persons.size());
        System.out.println("List size after removing duplicates: " + listWithoutDuplicates.size());

    }
}
