package com.oliwiatrojniak.saveapenny.shoppinglist;

public class ProductNotFound extends RuntimeException {

  public ProductNotFound(String message) {
    super(message);
  }

}