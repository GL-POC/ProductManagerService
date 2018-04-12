package com.gl.service;

import com.gl.entity.Product;
import com.gl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chethana.nk on 29/3/18.
 */

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product getProductById(String productId){

        return productRepository.getProductById(productId);

    }

    public void save(Product product){
         productRepository.save(product);
    }
}
