package com.shuhua.springbootmall.dao;

import com.shuhua.springbootmall.dto.ProductRequest;
import com.shuhua.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
}
