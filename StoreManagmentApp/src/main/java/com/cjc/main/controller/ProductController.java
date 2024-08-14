package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
	@GetMapping("/product")
	public Product getpro() {
		
		return new Product(1,"Sagar",152.2f,"dbjkcn","mobile","Apple",true);
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product)
	{
		return product;
	}
	
}
