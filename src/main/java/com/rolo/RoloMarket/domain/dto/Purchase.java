package com.rolo.RoloMarket.domain.dto;

import com.rolo.RoloMarket.persistence.entity.Clientes;

import java.time.LocalDate;

public class Purchase {
    private int idPurchase;
    private  int idClient;
    private LocalDate fecha;
    private String buy;
    private String comentary;
    private String status;
    private Clients client;

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

    public Client getClient() {
        return client;
    }
}
