package com.shuhua.springbootmall.dao;

import com.shuhua.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
