package br.com.orion.authorizationserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orion.authorizationserver.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService service;

    @GetMapping
    public ResponseEntity<?> listar() {
        return new ResponseEntity<>(this.service.findAll(), HttpStatus.OK);
    }

}