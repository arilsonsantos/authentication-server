package br.com.orion.authorizationserver.repository;

import java.util.List;

import br.com.orion.authorizationserver.model.Customer;

public interface ICustomer {

    public List<Customer> findAll();
    
}