package com.rolo.RoloMarket.domain.dto;

import org.hibernate.mapping.List;

public class Category {
    private int categoryId;
    private String description;
    private Boolean status;

    public Category(int categoryId, String description, Boolean status) {
        this.categoryId = categoryId;
        this.description = description;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
