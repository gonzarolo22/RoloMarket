package com.rolo.RoloMarket.persistence.Mapper;

import com.rolo.RoloMarket.domain.dto.Products;
import com.rolo.RoloMarket.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "id_producto", target ="products_id" ),
            @Mapping(source ="nombre" , target ="name" ),
            @Mapping(source =  "idCategoria", target ="idCategory"),
            @Mapping(source ="precioVenta" , target ="price" ),
            @Mapping(source ="cantidadStock" , target = "stock"),
            @Mapping(source ="estado" , target ="status" ),
            @Mapping(source ="categoria" , target ="category" )


    })
    Products toProducts(Producto producto);
    List<Products> toProductss(List<Producto> producto);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Products products);


    List<Products>toProductsList(List<Producto> producto);
}
