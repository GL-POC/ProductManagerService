package com.gl.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by chethana.nk on 29/3/18.
 */

@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String productName;
    private String locationID;

    public Product() {}

    public Product(String productName, String locationID) {
        this.productName = productName;
        this.locationID = locationID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
            "id=" + id +
            ", productName='" + productName + '\'' +
            ", locationID='" + locationID + '\'' +
            '}';
    }
}
