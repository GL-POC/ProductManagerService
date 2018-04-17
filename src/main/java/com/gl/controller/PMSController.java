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

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable String productId){
        Product product = productService.getProductById(productId);
        return product;

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product){
        productService.save(product);



    }
}
