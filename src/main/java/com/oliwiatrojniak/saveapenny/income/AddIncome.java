package com.oliwiatrojniak.saveapenny.income;

import lombok.Getter;

@Getter
public class AddIncome {

  String name;
  float price;

  public AddIncome(String name, float price){
    this.name = name;
    this.price = price;
  }

}
