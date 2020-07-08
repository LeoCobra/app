package com.cobra.app.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@Document
public class Product {
    @Id
    private ObjectId _id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
