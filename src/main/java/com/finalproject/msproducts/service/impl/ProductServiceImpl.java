package com.finalproject.msproducts.service.impl;

import com.finalproject.msproducts.dao.ProductEntity;
import com.finalproject.msproducts.exception.NotFoundException;
import com.finalproject.msproducts.mapper.ProductMapper;
import com.finalproject.msproducts.model.ProductDto;
import com.finalproject.msproducts.repository.ProductRepository;
import com.finalproject.msproducts.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    public final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(ProductDto productDto) {
        productRepository.save(ProductMapper.productDtoToProductEntity(productDto));
    }

    @Override
    public Page<ProductDto> getProducts(Pageable pageable) {
        return ProductMapper.PageProductEntitiesToProductDtos(productRepository.findAll(pageable));
    }

    @Override
    public void deleteProductsById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProductById(Long id, ProductDto productDto) {
        ProductEntity productEntity=productRepository.findById(id).orElseThrow(()->new NotFoundException("Not found product by this id"));
        productEntity.setProductName(productDto.getProductName());
        productEntity.setPrice(productDto.getPrice());
        productEntity.setQuantity(productDto.getQuantity());
        productEntity.setCountry(productDto.getCountry());
        productEntity.setPriceOfDelivery(productDto.getPriceOfDelivery());
        productEntity.setLinkForPictures(productDto.getLinkForPictures());
        productRepository.save(productEntity);
    }
}
