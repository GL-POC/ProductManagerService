package com.gl.dao;

import com.gl.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chethana.nk on 29/3/18.
 */
@Component
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(int prodcutId) {
        return null;
    }
}
