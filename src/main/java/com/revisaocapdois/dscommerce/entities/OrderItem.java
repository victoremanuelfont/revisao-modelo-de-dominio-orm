package com.revisaocapdois.dscommerce.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Double price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }
}
