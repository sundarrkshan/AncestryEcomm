package com.altmk.ancestryrest.model.dto;

import com.altmk.ancestryrest.model.Product;

public class ProductResponse {

    private Product product;
    private Status status;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
