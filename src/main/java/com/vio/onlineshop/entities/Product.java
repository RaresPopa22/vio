package com.vio.onlineshop.entities;

public class Product {

  private String name;
  private Double price;
  private Double rating;

  public Product() {
  }

  public Product(final String name, final Double price, final Double rating) {
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(final Double price) {
    this.price = price;
  }

  public Double getRating() {
    return rating;
  }

  public void setRating(final Double rating) {
    this.rating = rating;
  }
}
