package com.rolo.RoloMarket.domain.repository;

import com.rolo.RoloMarket.domain.dto.Products;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Products>getAll();
    Optional<List<Products>>getByCategory(int categoryId);
    Optional<List<Products>>getScarseProducts(int quantity);
    Optional<Products>getProducts(int productsId);
    Products save(Products products);
    void delete(int productId);
}
