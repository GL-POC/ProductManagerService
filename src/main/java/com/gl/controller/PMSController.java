package com.gl.controller;

import com.gl.entity.Product;
import com.gl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chethana.nk on 29/3/18.
 */

@RestController
public class PMSController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int id){
        Product product = productService.getProductById(id);
        return product;

    }

}
