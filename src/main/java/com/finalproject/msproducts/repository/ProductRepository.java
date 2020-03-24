package com.finalproject.msproducts.repository;


import com.finalproject.msproducts.dao.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
