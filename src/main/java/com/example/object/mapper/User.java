package com.example.object.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    // default 생성자 필요

    public User() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // object mapper 가 참조하는 클래스에는 get 메소드를 활용한다
    // getDefaultUser (X) -> defaultUser (O)
    public User defaultUser() {
        return new User("default", 0, "010-1234-5678");
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
    }
}
