package com.rolo.RoloMarket.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoria_id")
    private Integer categoriaId;

    private String descripcion;

    private Boolean estado;



    @OneToMany(mappedBy = "categoria")
    private List<Producto>productos;

    public Categoria() {
    }

    public Categoria(Integer categoriaId, String descripcion, Boolean estado, List<Producto> productos) {
        this.categoriaId = categoriaId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.productos = productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }
    public String getDescription() {
        return descripcion;
    }

    public void setDescription(String description) {
        this.descripcion = description;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
