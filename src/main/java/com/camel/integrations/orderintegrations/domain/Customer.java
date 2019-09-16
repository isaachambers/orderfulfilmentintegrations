package com.camel.integrations.orderintegrations.domain;

import javax.persistence.Entity;

@Entity
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
