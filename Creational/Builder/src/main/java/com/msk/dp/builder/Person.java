package com.msk.dp.builder;

public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;

    private final String email;

    // create the private constructor with another static class as an argument
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.email = builder.email;
    }

    // Create the static class with all the field in main class
    public static class PersonBuilder {
        private final String name;
        private int age = 0;
        private String gender = "";
        private String address = "";
        private String email = "";

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

