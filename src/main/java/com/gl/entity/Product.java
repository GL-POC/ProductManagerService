package com.gl.entity;

/**
 * Created by chethana.nk on 29/3/18.
 */

public class Product {

    private int productId;
    private String productName;
    private String locationID;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    @Override
    public String toString() {
        return "Product{" +
            "productId=" + productId +
            ", productName='" + productName + '\'' +
            ", locationID='" + locationID + '\'' +
            '}';
    }
}
