package com.gl.controller;

import com.gl.entity.Product;
import com.gl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chethana.nk on 29/3/18.
 */
@RestController
public class PMSController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        Product product = productService.getProductById(id);
        return product;

    }
}
