package com.gl.repository;

import com.gl.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by chethana.nk on 29/3/18.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

     Product getProductById(String productId);
}
