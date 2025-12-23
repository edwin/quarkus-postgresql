package com.edw.service;

import com.edw.model.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 * <pre>
 *  com.edw.service.CustomerService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Dec 2025 11:37
 */
@Transactional
@ApplicationScoped
public class CustomerService {

    @Inject
    EntityManager em;

    public List<Customer> findAll() {
        return em.createQuery("select c from Customer c order by customerId", Customer.class).getResultList();
    }

}
