package com.rolo.RoloMarket.persistence.crud;

import com.rolo.RoloMarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto>findByIdCategoriaOrderByNombreAsc(int idCategoria); //seria loo mismo que poner un @query= "SELECT * FROM Productos where id_categoria=?"
    //las palabras claves en este caso son findById



}
