package com.react.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.model.product;
@Repository
public interface ProductRepository extends JpaRepository<product, Integer>{

}
