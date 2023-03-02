package com.rolo.RoloMarket.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_producto")
public class CompraProducto {
    @EmbeddedId     // cuando una tabla de base de datos tiene una clave primaria compuesta por dos o más campos, @EmbeddedId permite definir esa clave primaria como una clase incrustada dentro de la entidad, en lugar de usar la anotación @Id en cada campo.
    private ComprasProductosPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Compras compras;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;


    public ComprasProductosPK getId() {
        return id;
    }

    public void setId(ComprasProductosPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
