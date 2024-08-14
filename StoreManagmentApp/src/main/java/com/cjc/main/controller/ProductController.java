package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
	@GetMapping("/product")
	public Product getpro() {
		
		return new Product(1,"Sagar",152.2f,"dbjkcn","mobile","Apple",true);
	}
	@PutMapping("/tonny_product/{pid}")
	public Product updateProduct(@PathVariable int pid ,@RequestBody Product product)
	{
		return product;
	}
	
}
