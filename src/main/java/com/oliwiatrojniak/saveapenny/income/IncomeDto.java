package com.oliwiatrojniak.saveapenny.income;

public class IncomeDto {

  long id;
  String name;
  float price;

  public IncomeDto(long id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
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

}
