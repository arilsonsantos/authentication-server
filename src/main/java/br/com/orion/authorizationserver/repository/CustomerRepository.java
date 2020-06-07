package br.com.orion.authorizationserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.orion.authorizationserver.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>  {
    
}