package com.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.react.model.product;
import com.react.service.productService;

@Controller
@RequestMapping("/exm")
public class HomeController {

	@Autowired
	private productService ps;
	@PostMapping("/saveProduct")
	public ResponseEntity<product> saveProduct(@RequestBody product p){
		return  new ResponseEntity<product>(ps.saveProduct(p),HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<List<product>> getAllProduct() {
		return new ResponseEntity<List<product>>(ps.getAllProduct(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<product> getProductById(@PathVariable int id){
		return new ResponseEntity<product>(ps.getProductById(id),HttpStatus.OK);
	}
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		ps.deleteProduct(id);
		return new ResponseEntity<String>("delete successfull",HttpStatus.OK);
	}
	@PutMapping("/editProduct/{id}")
	public ResponseEntity<product> editProduct(@PathVariable("id") int id,product p) {
		return new ResponseEntity<product>(ps.editProduct(p),HttpStatus.CREATED);
	}
}
