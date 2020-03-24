package com.finalproject.msproducts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String productName;
    private double price;
    private Long quantity;
    private String country;
    private double priceOfDelivery;
    private String linkForPictures;
}
