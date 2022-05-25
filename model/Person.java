package com.test1.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Person {

    private String firstName;
    private String lastName;
    Person( String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


@Override
    public String toString(){
        return firstName+" "+lastName;
    }

}