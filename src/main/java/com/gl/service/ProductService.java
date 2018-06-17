package com.gl.service;

import com.gl.entity.Product;
import com.gl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Created by chethana.nk on 29/3/18.
 */

@Service
@RefreshScope
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product getProductById(String productId){

        return productRepository.getProductById(productId);

    }

    public void save(Product product){
         productRepository.save(product);
    }

    public void deleteProduct(String productId){
        productRepository.delete(productId);
    }

    public Product updateProduct(String productId, Product product){
       Product productById= productRepository.getProductById(productId);
       productById.setProductName(product.getProductName());
       productById.setLocationID(product.getLocationID());

       return productRepository.save(productById);
    }
}
