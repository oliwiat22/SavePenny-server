package com.oliwiatrojniak.saveapenny.shoppinglist;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product, Long> {

}
