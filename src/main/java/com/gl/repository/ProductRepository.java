package com.gl.repository;

import com.gl.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chethana.nk on 29/3/18.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

     Product getProductById(String productId);
}
