package com.shen.ssm.dao;

import com.shen.ssm.domain.Product;
import java.util.List;
public interface ProductDao {

    List<Product> findAll();

    void saveProduct(Product product);
}
