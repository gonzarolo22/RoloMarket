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
        return productsService.getProductsId(id);
    }

    @GetMapping("/category/{id}")
    Optional<List<Products>>getForCategory(@PathVariable Integer categoryId){
        return productsService.getByCategory(categoryId);
    }
    @PostMapping("/save")
    Products save(@RequestBody Products products){
        return productsService.save(products);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id){
        productsService.delete(id);
    }





}
