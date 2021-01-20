package com.manager.practice.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private int quantity;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address, int quantity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.quantity = quantity;
    }

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
