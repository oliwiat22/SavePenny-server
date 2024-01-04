package com.oliwiatrojniak.saveapenny.shoppinglist;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShoppingListService {

  ProductRepository productRepository;

  ProductDto addToShoppingList(AddProduct newProduct){

    Product product = new Product(newProduct.name, newProduct.price, newProduct.quantity);
    productRepository.save(product);
    return product.convertToDto();

  }

  void deleteFromShoppingList(DeleteProduct toDeleteProduct){
    productRepository.deleteById(toDeleteProduct.id);
  }

  ProductDto findProduct(Long id) {
    final Optional<Product> foundProduct = productRepository.findById(id);
    if (foundProduct.isPresent()) {
      return foundProduct.get().convertToDto();
    } else {
      throw new ProductNotFound(id.toString());
    }
  }

  List<ProductDto> showShoppingList() {
    return productRepository.findAll().stream()
        .map(product -> product.convertToDto())
        .collect(Collectors.toList());
  }

}
