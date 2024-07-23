package com.example.customerprovincespringboot.service;

import com.example.customerprovincespringboot.model.Customer;
import com.example.customerprovincespringboot.model.Province;

import java.util.Optional;

public interface IGenerateService <T>{
    Iterable<T> findAll();

    void save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
