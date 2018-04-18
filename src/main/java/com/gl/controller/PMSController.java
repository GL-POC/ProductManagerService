package com.gl.controller;

import com.gl.entity.Product;
import com.gl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chethana.nk on 29/3/18.
 */

@RestController
public class PMSController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/product/{productId}")
    public Product getProductById(@PathVariable String productId){
        Product product = productService.getProductById(productId);
        return product;

    }

    @PostMapping(value = "/save")
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    }


    @DeleteMapping(value = "/delete/{productId}")
    public void deleteProduct(@PathVariable String productId){
        productService.deleteProduct(productId);
    }


    /*@PutMapping(value = "/update/{productId}")
    public Product updateProduct(@PathVariable String productId){

    }*/
}
