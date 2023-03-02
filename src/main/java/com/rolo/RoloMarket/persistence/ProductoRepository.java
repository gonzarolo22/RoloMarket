package com.rolo.RoloMarket.persistence;

import com.rolo.RoloMarket.persistence.crud.ProductoCrudRepository;
import com.rolo.RoloMarket.persistence.entity.Categoria;
import com.rolo.RoloMarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;


    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //este es el metodo query creado en ProductoCrudRepository
    public List<Producto>getAllCategoriaId(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<Producto> getById(Integer id){
        return productoCrudRepository.findById(id);
    }

    public void deleteById(Integer id){
        productoCrudRepository.deleteById(id);
    }

    public void deleteAll(){
        productoCrudRepository.deleteAll();
    }



}
