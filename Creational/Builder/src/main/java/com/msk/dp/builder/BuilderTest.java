package com.msk.dp.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Mithil")
                .age(1)
                .gender("Male")
                .address("902, Florida Watercolor")
                .email("mithil@google.com")
                .build();

        System.out.println(person);
    }
}
