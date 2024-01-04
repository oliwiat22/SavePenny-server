package com.oliwiatrojniak.saveapenny.shoppinglist;

public class ProductDto {

  long id;
  String name;
  float price;
  int quantity;

  public ProductDto(long id, String name, float price, int quantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

}
