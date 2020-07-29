package com.designpatterns.designpatterns.builder;

/**
 * Description
 * Date 2020/7/29 22:38
 * Created by kwz
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private double weight;
    private int score;
    private Location loc;

    private Person() {
    }

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }


        public PersonBuilder loc(String street, String roomNo) {
            person.loc = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", loc=" + loc +
                '}';
    }
}
