package com.shen.ssm.service;

import com.shen.ssm.domain.Product;
import java.util.List;
public interface ProductService {
    /**
     * 查找所有
     * @return
     * @param currentPages
     * @param pageSizes
     */
    List<Product>findAll(int currentPages, int pageSizes);

    /**
     * 添加一条订单
     * @param product
     */
    void saveProduct(Product product);
}
