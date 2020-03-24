package com.finalproject.msproducts.mapper;

import com.finalproject.msproducts.dao.ProductEntity;
import com.finalproject.msproducts.model.ProductDto;
import org.springframework.data.domain.Page;

public class ProductMapper {
    public static ProductEntity productDtoToProductEntity(ProductDto productDto){
        return ProductEntity.builder()
                .productName(productDto.getProductName())
                .price(productDto.getPrice())
                .quantity(productDto.getQuantity())
                .country(productDto.getCountry())
                .priceOfDelivery(productDto.getPriceOfDelivery())
                .linkForPictures(productDto.getLinkForPictures())
                .build();
    }

    public static  ProductDto productEntityToProductDto(ProductEntity productEntity){
        return ProductDto.builder()
                .productName(productEntity.getProductName())
                .price(productEntity.getPrice())
                .quantity(productEntity.getQuantity())
                .country(productEntity.getCountry())
                .priceOfDelivery(productEntity.getPriceOfDelivery())
                .linkForPictures(productEntity.getLinkForPictures())
                .build();
    }

    public static  ProductDto productEntityToProductDtoForUpdate(ProductEntity productEntity){
        return ProductDto.builder()
                .id(productEntity.getId())
                .productName(productEntity.getProductName())
                .price(productEntity.getPrice())
                .quantity(productEntity.getQuantity())
                .country(productEntity.getCountry())
                .priceOfDelivery(productEntity.getPriceOfDelivery())
                .linkForPictures(productEntity.getLinkForPictures())
                .build();
    }

    public static Page<ProductDto> PageProductEntitiesToProductDtos(Page<ProductEntity> page){
        return page.map(ProductMapper::productEntityToProductDtoForUpdate);
    }
}
