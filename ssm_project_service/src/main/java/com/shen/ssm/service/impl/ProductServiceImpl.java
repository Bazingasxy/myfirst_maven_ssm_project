package com.shen.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.shen.ssm.dao.ProductDao;
import com.shen.ssm.domain.Product;
import com.shen.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll(int currentPages, int pageSizes) {
        PageHelper.startPage(currentPages,pageSizes);
        return productDao.findAll();
    }

    @Override
    public void saveProduct(Product product) {

    }
}
