package com.rolo.RoloMarket.persistence.Mapper;

import com.rolo.RoloMarket.domain.dto.PurchaseItem;
import com.rolo.RoloMarket.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source="id.id_producto", target = "productId"),
            @Mapping(source = "cantidad", target = "amount"),
            @Mapping(source = "estado", target = "status")
    })
    PurchaseItem toPurchaseItem(CompraProducto compraProducto);

    @InheritInverseConfiguration
    @Mapping()
    CompraProducto toCompraProducto(PurchaseItem purchaseItem);

}
