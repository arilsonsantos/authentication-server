package br.com.orion.authorizationserver.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService<E, I extends Serializable, R extends CrudRepository<E, I>> { 
    
    @Autowired
    private R repository;

    public E save(E entity) {
        return this.repository.save(entity);
    }
    
    public E findOne(I id) {
        return this.repository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found."));
    }
    
    public List<E> findAll() {
        return (List<E>) this.repository.findAll();
    }
    
    public void delete(I id) {
        this.repository.deleteById(id);
    }
   
    public R getRepository() {
        return repository;
    }
   
}