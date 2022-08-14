package ru.netology.tickets.Repository;

import ru.netology.tickets.Product;

public class ProductRepository {

    Product[] products = new Product[0];

    public ProductRepository() {

    }

    public ProductRepository(Product[] products){
        this.products = products;
    }

    public Product[] getProducts(){
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {
        return getProducts();
    }
}
