package com.shuhua.springbootmall.service;

import com.shuhua.springbootmall.constant.ProductCategory;
import com.shuhua.springbootmall.dto.ProductRequest;
import com.shuhua.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory Category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
