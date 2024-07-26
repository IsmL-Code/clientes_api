package com.withIsmlCode.clientes_api.service;

import com.withIsmlCode.clientes_api.entity.Customer;
import com.withIsmlCode.clientes_api.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer postCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return  customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return  customerRepository.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
