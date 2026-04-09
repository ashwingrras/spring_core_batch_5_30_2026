package org.example.beans;

public class Product
{
    public int id;

    public String name;

    public Brand brand;


    public Product(Brand brand) {
        this.brand = brand;
    }

    public Product(int id, String name, Brand brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }
}
