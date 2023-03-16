package com.rolo.RoloMarket.persistence.Mapper;

import com.rolo.RoloMarket.domain.dto.Purchase;
import com.rolo.RoloMarket.persistence.entity.Compras;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = )
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source ="idCompra", target = "idPurchase"),
            @Mapping(source = "idCliente", target = "idClient"),
            @Mapping(source = "fecha", target = "fecha"),
            @Mapping(source = "medio_pago", target = "buy"),
            @Mapping(source = "comentario", target = "comantary"),
            @Mapping(source = "estado", target = "status"),
            @Mapping(source = "compraProductos",  target = "purchaseItems")
    })
    Purchase toPurchase(Compras compras);

}
