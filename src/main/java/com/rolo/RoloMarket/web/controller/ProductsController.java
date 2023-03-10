package com.rolo.RoloMarket.web.controller;

import com.rolo.RoloMarket.domain.dto.Products;
import com.rolo.RoloMarket.domain.repository.ProductRepository;
import com.rolo.RoloMarket.domain.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;


    @GetMapping("/")
    List<Products> getAll(){
        return productsService.getAll();
    }

    @GetMapping("/{id}")
    Optional<Products> getForId(@PathVariable Integer id){
        return productsService.getProducts(id);
    }

    @PostMapping
    Products save(Products products){
        return productsService.save(products);
    }

}
