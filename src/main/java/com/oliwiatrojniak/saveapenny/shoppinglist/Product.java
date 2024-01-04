package com.oliwiatrojniak.saveapenny.shoppinglist;

final class Product {

  long id;
  String name;
  float price;
  int quantity;

  public Product(String name, float price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  ProductDto convertToDto() {
    return new ProductDto(id, name, price, quantity);
  }

}
