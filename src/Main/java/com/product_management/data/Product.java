package com.product_management.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1); // 10% discount

    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_UP);
    }
    public BigDecimal getDiscountedPrice() {
        return price.subtract(getDiscount()).setScale(2,RoundingMode.HALF_UP);
    }

}
