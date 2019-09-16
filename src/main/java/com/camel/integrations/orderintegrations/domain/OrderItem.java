package com.camel.integrations.orderintegrations.domain;

import java.util.Date;

public class OrderItem {
    private Long id;
    private Order order;
    private String status;
    private double price;
    private Date lastUpdate;
    private int quantity;
    private CatalogItem catalogItem;
}
