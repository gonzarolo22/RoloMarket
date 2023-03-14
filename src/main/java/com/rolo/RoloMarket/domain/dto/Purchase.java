package com.rolo.RoloMarket.domain.dto;

import com.rolo.RoloMarket.persistence.entity.Clientes;

import java.time.LocalDate;
import java.util.List;

public class Purchase {
    private int idPurchase;
    private  int idClient;
    private LocalDate fecha;
    private String buy;
    private String comentary;
    private String status;
    private List<PurchaseItem> purchaseItems;

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public int getIdClient() {
        return idClient;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getBuy() {
        return buy;
    }

    public String getComentary() {
        return comentary;
    }

    public String getStatus() {
        return status;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public void setComentary(String comentary) {
        this.comentary = comentary;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
