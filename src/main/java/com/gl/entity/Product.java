package com.gl.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by chethana.nk on 29/3/18.
 */

@Document(collection = "products")
public class Product {

    @Id
    private String productId;
    private String productName;
    private String locationID;

    public Product() {}

    public Product(String productName, String locationID) {
        this.productName = productName;
        this.locationID = locationID;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
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
