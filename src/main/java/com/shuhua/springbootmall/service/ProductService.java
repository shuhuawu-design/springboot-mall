package com.shuhua.springbootmall.service;

import com.shuhua.springbootmall.dto.ProductRequest;
import com.shuhua.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
}
