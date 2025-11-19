package com.product_management.app;

import java.math.BigDecimal;

import com.product_management.data.Product;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(101);
        product1.setName("Laptop");
        product1.setPrice(new BigDecimal("999.99"));
        System.out.println("Product ID: " + product1.getId() + ", Name: " + product1.getName() + ", Price: $" + product1.getPrice() + ", Discount: $" + product1.getDiscount() + ", Discounted Price: $" + product1.getDiscountedPrice());
    }
}