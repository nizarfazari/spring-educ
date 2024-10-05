package belajarspring.spring.core.services;


import belajarspring.spring.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {



    @Getter
    @Autowired
    private CustomerRepository customerRepository;

}
