package com.rolo.RoloMarket.domain.repository;

import com.rolo.RoloMarket.domain.dto.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase>getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
