package com.oliwiatrojniak.saveapenny.income;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "income")
class Income {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String name;
  float price;

  public Income(String name, float price){
    this.name = name;
    this.price = price;
  }

  IncomeDto convertToDto() {
    return new IncomeDto(id, name, price);
  }

}
