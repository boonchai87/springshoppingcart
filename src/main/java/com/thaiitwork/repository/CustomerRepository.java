package com.thaiitwork.repository;

import com.thaiitwork.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByFirstName(String firstName);
}
