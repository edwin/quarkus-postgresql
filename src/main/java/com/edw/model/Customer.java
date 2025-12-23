package com.edw.model;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * <pre>
 *  com.edw.model.Customer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Dec 2025 11:36
 */
@Entity
@Table(name = "t_customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    public Customer() {
    }

    public Customer(Long customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
