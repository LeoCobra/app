package com.cobra.app.conveters;

import com.cobra.app.commands.ProductForm;
import com.cobra.app.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {


    @Override
    public Product convert(ProductForm productForm) {

        Product product = new Product();
        if (productForm.getId() !=null && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(new ObjectId(productForm.getId()));
        }
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());

        return product;
    }
}
