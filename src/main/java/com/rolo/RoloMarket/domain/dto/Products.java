package com.rolo.RoloMarket.domain.dto;

public class Products {
    private int products_id;
    private String name;
    private int idCategory;
    private int price;
    private int stock;
    private Boolean status;

    private Category category;

    public Products(int products_id, String name, int idCategory, int price, int stock, Boolean status, Category category) {
        this.products_id = products_id;
        this.name = name;
        this.idCategory = idCategory;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
