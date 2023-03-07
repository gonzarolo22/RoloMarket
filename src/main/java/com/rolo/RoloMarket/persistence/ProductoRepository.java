package com.rolo.RoloMarket.persistence;

import com.rolo.RoloMarket.domain.dto.Products;
import com.rolo.RoloMarket.domain.repository.ProductRepository;
import com.rolo.RoloMarket.persistence.Mapper.ProductMapper;
import com.rolo.RoloMarket.persistence.crud.ProductoCrudRepository;
import com.rolo.RoloMarket.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper productMapper;

    public List<Products> getAll(){
     List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
     return productMapper.toProductsList(productos);
    }

    @Override
    public Optional<List<Products>> getByCategory(int categoryId) {
        List<Producto> productos= productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(productMapper.toProductsList(productos));
    }

    @Override
    public Optional<List<Products>> getScarseProducts(int quantity) {

        return Optional.empty();
    }

    @Override
    public Optional<Products> getProducts(int productsId) {
        Optional<Producto> forId= productoCrudRepository.findById(productsId);

        return Optional.of(productMapper.toProducts(forId));
    }

    @Override
    public Products save(Products products) {
        Producto producto= productMapper.toProducto(products);
        return productMapper.toProducts(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }

/*
    public Optional<Producto> getById(Integer id){
        return productoCrudRepository.findById(id);
    }

    public void deleteById(Integer id){
        productoCrudRepository.deleteById(id);
    }

    public void deleteAll(){
        productoCrudRepository.deleteAll();
    }




    //este es el metodo query creado en ProductoCrudRepository
   public List<Producto>getAllCategoriaId(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
  */
}
