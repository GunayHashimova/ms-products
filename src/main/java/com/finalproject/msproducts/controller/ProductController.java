package com.finalproject.msproducts.controller;

import com.finalproject.msproducts.model.ProductDto;
import com.finalproject.msproducts.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }

    @GetMapping
    public Page<ProductDto> getProducts(Pageable pageable){
        return productService.getProducts(pageable);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProductsById(id);
    }

    @PutMapping("{id}")
    public void updateProductById(@PathVariable Long id,@RequestBody ProductDto productDto){
        productService.updateProductById(id,productDto);
    }
}
