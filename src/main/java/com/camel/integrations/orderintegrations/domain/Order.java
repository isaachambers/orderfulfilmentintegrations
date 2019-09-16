package com.camel.integrations.orderintegrations.domain;

import java.util.Date;

public class Order {
    private Long id;
    private Customer customer;
    private String orderNumber;
    private Date timeOrderPlaced;
    private Date lastUpdate;
    private String status;

}
