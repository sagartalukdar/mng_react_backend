package com.react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.model.product;
import com.react.repo.ProductRepository;

@Service
public class productServiceImpl implements productService{

	@Autowired
	private ProductRepository pr;

	@Override
	public product saveProduct(product p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public List<product> getAllProduct() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public product getProductById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		product p=pr.findById(id).get();
		pr.delete(p);
	}

	@Override
	public product editProduct(product p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}
}
