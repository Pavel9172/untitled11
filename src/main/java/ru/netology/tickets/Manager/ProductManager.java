package ru.netology.tickets.Manager;

import ru.netology.tickets.Product;
import ru.netology.tickets.Repository.ProductRepository;
import java.util.Arrays;
public class ProductManager {

    ProductRepository repository = new ProductRepository();

    public ProductManager() {

    }

    public ProductManager(ProductRepository repository) {
        this.repository = repository;

    }

    public ProductRepository getRepository() {
        return repository;
    }

    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public Product[] findAll(String from, String to) {
        Product[] results = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, from, to)) {
                Product[] tmp = new Product[results.length + 1];
                for (int i = 0; i < results.length; i++) {
                    tmp[i] = results[i];
                }
                tmp[tmp.length - 1] = product;
                results = tmp;

            }
        }
        Arrays.sort(results);
        return results;
    }

    public boolean matches(Product product, String form, String to) {
        if (product.getFrom() != form) {
            return false;
        }
        if (product.getTo() != to) {
            return false;
        }
        return true;
    }
}
