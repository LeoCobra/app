package com.cobra.app.commands;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductForm {
    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
