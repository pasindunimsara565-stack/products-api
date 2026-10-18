
package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {


    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add a new product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;

    }
    // ---- in ProductService.java ----
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
    // ---- in ProductService.java ----
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
    // ---- in ProductService.java ----
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}
