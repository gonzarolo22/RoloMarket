package com.rolo.RoloMarket.persistence.Mapper;

import com.rolo.RoloMarket.domain.dto.Category;
import com.rolo.RoloMarket.persistence.entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "Spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source="categoriaid", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "status"),
    })
    Category toCatogory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria tocategoria(Category category);

}
