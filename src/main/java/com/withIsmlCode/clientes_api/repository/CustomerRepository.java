package com.withIsmlCode.clientes_api.repository;

import com.withIsmlCode.clientes_api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long > {
}
