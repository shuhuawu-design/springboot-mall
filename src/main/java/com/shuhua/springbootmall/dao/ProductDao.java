package com.shuhua.springbootmall.dao;

import com.shuhua.springbootmall.constant.ProductCategory;
import com.shuhua.springbootmall.dto.ProductRequest;
import com.shuhua.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
    List<Product> getProducts(ProductCategory Category, String search);
}
