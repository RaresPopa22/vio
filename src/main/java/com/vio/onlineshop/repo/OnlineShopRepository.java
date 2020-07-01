package com.vio.onlineshop.repo;
import com.vio.onlineshop.entities.Product;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OnlineShopRepository {

  private final List<Product> products = new ArrayList<Product>();

  @PostConstruct
  public void init() {
    products.add(new Product("Apple", 1000.0, 4.5));
    products.add(new Product("Asus", 500.0, 4.4));
    products.add(new Product("Lenovo", 600.0, 4.9));
  }

  public List<Product> getAll() {
    return products;
  }

  public Product getById(final int id) {
    return products.get(id);
  }

  public void post(final Product product) {
    products.add(product);
  }
}
