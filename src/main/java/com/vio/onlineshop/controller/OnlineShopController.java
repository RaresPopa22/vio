package com.vio.onlineshop.controller;

import com.vio.onlineshop.entities.Product;
import com.vio.onlineshop.repo.OnlineShopRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OnlineShopController {

  private final OnlineShopRepository repository;

  OnlineShopController(final OnlineShopRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public String test() {
    return "Hello World";
  }

  @GetMapping("/products")
  public List<Product> getAll() {
    return repository.getAll();
  }

  @GetMapping("/products/{id}")
  public Product getById(@PathVariable final int id) {
    return repository.getById(id);
  }

  @PostMapping("/products")
  public void post(@RequestBody final Product product) {
    repository.post(product);
  }
}
