package com.rolo.RoloMarket.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto", nullable = false, unique = true)
    private Integer id_producto;

    private String nombre;

    @Column(name = "id_categoria")   // pongo esta anotacion con el name(nombre real de la columna) cuando la variable se nombra distinto a la columna.
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false, updatable = false)
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Integer id_producto, String nombre, Integer idCategoria, String codigoBarras, Double precioVenta, Integer cantidadStock, Boolean estado, Categoria categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.codigoBarras = codigoBarras;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.estado = estado;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
