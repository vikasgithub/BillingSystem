package com.mckinsey.exercise.domain;

/**
 * Encapsulates a product, which a user orders.
 *
 * Created by IntelliJ IDEA.
 * User: vikas
 * Date: 20/10/12
 * Time: 9:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    private String code;

    private String name;

    private double price;

    private ProductType productType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Product(String code, String name, double price, ProductType productType) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.productType = productType;
    }
}
