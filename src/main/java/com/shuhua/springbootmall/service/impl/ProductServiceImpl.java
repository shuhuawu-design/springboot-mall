package com.shuhua.springbootmall.service.impl;

import com.shuhua.springbootmall.dao.ProductDao;
import com.shuhua.springbootmall.model.Product;
import com.shuhua.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
