package ru.netology.tickets.Manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import ru.netology.tickets.Product;
import ru.netology.tickets.Repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void findAllWithoutMock() {
        ProductManager managerWithoutMock = new ProductManager();
        Product product1 = new Product(1, 25000, "Москва Внуково", "Тюмень", 95);
        Product product2 = new Product(2, 15000, "Москва Внуково", "Тюмень", 76);
        Product product3 = new Product(3, 3000, "Москва Домодедово", "Тюмень", 60);
        managerWithoutMock.add(product1);
        managerWithoutMock.add(product2);
        managerWithoutMock.add(product3);
        Product[] expected = new Product[] {product2,product1};
        assertArrayEquals(expected, managerWithoutMock.findAll("Москва Внуково", "Тюмень"));
    }

    
}