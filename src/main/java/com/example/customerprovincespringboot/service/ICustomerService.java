package com.example.customerprovincespringboot.service;

import com.example.customerprovincespringboot.model.Customer;
import com.example.customerprovincespringboot.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGenerateService<Customer> {

    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
