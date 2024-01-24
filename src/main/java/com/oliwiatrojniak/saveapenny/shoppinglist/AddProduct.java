package com.oliwiatrojniak.saveapenny.shoppinglist;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class AddProduct {

  String name;
  float price;
  int quantity;

  public AddProduct(String name, float price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }


}
