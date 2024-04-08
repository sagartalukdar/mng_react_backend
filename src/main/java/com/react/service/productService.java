package com.react.service;

import java.util.List;

import com.react.model.product;

public interface productService {

	public product saveProduct(product p);
	public List<product> getAllProduct();
	public product getProductById(int id);
	public void deleteProduct(int id);
	public product editProduct(product p);
}
