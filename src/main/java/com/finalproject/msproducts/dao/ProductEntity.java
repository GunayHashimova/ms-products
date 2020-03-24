package com.finalproject.msproducts.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class ProductEntity  {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_sequence")
    @SequenceGenerator(name = "product_sequence",sequenceName = "product_sequence")
    private Long id;

    @Column(name = "products_name")
    private String productName;

    @Column
    private Double price;

    @Column
    private Long quantity;

    @Column
    private String country;

    @Column
    private Double priceOfDelivery;

    @Column
    private String linkForPictures;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
