package com.guo.pizza.service;
import com.springinaction.pizza.domain.Customer;

public interface CustomerService {
   Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
