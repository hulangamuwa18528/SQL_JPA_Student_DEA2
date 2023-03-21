package com.example.demo1;

import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Student()
    {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
