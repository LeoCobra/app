package com.cobra.app.service;

import com.cobra.app.domain.Product;

import java.util.List;

public interface ProductService {

    Product saveOrUpdate(Product product);

    List<Product> listAll();

}
