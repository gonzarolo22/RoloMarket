package com.rolo.RoloMarket.domain.service;

import com.rolo.RoloMarket.domain.dto.Products;
import com.rolo.RoloMarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired
    private ProductRepository productRepository;


    public List<Products> getAll(){
        return productRepository.getAll();
    }

    public Optional<List<Products>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }
    public Optional<Products>getProducts(int productsId){
        return productRepository.getProducts(productsId);
    }
    public Products save(Products products){
        return productRepository.save(products);
    }
    public void delete(int productId){
        productRepository.delete(productId);
    }




}
