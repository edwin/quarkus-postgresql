package com.edw.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;
}
