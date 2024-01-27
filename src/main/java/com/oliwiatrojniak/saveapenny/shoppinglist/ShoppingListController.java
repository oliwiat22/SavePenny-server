package com.oliwiatrojniak.saveapenny.shoppinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/shopping-list")
class ShoppingListController {

  private final ShoppingListService service;

  @Autowired
  public ShoppingListController(ShoppingListService service) {
    this.service = service;
  }

  @PostMapping("/add")
  public ProductDto addToShoppingList(@RequestBody AddProduct newProduct) {
    return service.addToShoppingList(newProduct);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteFromShoppingList(@PathVariable long id) {
    service.deleteFromShoppingList(new DeleteProduct(id));
  }

  @GetMapping("/{id}")
  public ProductDto findProduct(@PathVariable long id) {
    return service.findProduct(id);
  }

  @GetMapping("/")
  public List<ProductDto> showShoppingList() {
    return service.showShoppingList();
  }

}
