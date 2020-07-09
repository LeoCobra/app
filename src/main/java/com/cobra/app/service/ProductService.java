package com.cobra.app.service;

import com.cobra.app.commands.ProductForm;
import com.cobra.app.domain.Product;

import java.util.List;

public interface ProductService {

    Product saveOrUpdate(Product product);

    List<Product> listAll();

    Product saveOrUpdateProductForm(ProductForm productForm);

    Product getById(String id);
}
