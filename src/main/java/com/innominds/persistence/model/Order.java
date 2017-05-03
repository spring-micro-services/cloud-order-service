package com.innominds.persistence.model;

public class Order {

    private final String orderNumber;

    public Order( String orderNumber ) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

}
