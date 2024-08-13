package com.cjc.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int productId;
	private String productName;
	private float price;
	private String describtion;
	private String category;
	private String supplierName;
	private boolean inStock;
}
