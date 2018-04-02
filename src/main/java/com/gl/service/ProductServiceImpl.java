package com.gl.service;

import com.gl.dao.ProductDao;
import com.gl.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chethana.nk on 29/3/18.
 */

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }
}
