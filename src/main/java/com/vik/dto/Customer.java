package com.vik.dto;

public class Customer {

    String id;
    String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
