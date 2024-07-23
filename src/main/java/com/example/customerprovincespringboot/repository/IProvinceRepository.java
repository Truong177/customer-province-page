package com.example.customerprovincespringboot.repository;

import com.example.customerprovincespringboot.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province,Long> {
}
