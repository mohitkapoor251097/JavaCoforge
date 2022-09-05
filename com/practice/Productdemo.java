package com.practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product
{
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Productdemo {
    public static void main(String[] args) {
        Product pr1=new Product(11,"Tv");
        Product pr2=new Product(11,"Tv");
        Set<Product> productSet=new HashSet<>();
        productSet.add(pr1);
        productSet.add(pr2);
        System.out.println(productSet);

    }
}
