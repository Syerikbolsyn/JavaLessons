package org.example.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;
    @NotEmpty(message = "name can't be empty")
    @Size(message = "size should between 2 and 30 characters")
    private String name;

    @Min(value = 2, message = "age should be at 2")
    private int age;
    @NotEmpty(message = "Email should be not empty")
    @Email(message = "email should be valid")
    private String email;

    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Person(int id, String name, int age, String email) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public Person() {}
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

