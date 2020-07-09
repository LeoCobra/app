package com.cobra.app.service;

import com.cobra.app.commands.ProductForm;
import com.cobra.app.conveters.ProductFormToProduct;
import com.cobra.app.domain.Product;
import com.cobra.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public Product getById(String id) {
        return productRepository.findById(id).orElse(null);
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
    }


}
