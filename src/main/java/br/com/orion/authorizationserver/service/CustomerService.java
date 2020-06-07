package br.com.orion.authorizationserver.service;

import org.springframework.stereotype.Service;

import br.com.orion.authorizationserver.model.Customer;
import br.com.orion.authorizationserver.repository.CustomerRepository;

@Service
public class CustomerService extends AbstractService<Customer, Long, CustomerRepository>   {
    
}