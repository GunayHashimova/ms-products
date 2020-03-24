package com.finalproject.msproducts.service;

import com.finalproject.msproducts.model.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    void addProduct(ProductDto productDto);

    Page<ProductDto> getProducts(Pageable pageable);

    void deleteProductsById(Long id);

    void updateProductById(Long id,ProductDto productDto);
}
