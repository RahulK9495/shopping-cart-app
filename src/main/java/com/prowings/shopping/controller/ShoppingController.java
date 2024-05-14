package com.prowings.shopping.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.shopping.model.dto.ProductDto;
import com.prowings.shopping.model.source.Product;
import com.prowings.shopping.service.cartService;
import com.prowings.shopping.service.cartServiceImpl;

@RestController
public class ShoppingController {

	@Autowired
	cartService cartservice;
	
	private Map<String, Double> products =new HashMap<>();
	
	@GetMapping("/product/{id}")
	public ResponseEntity<ProductDto> addProductToCart(@PathVariable int id)
	{
		System.out.println("Inside controller method");
		ResponseEntity<ProductDto> addedproduct = cartservice.addProductItemTocart(id);
		
		products.put(addedproduct.getBody().getName(), addedproduct.getBody().getPrice());
		
		return addedproduct;
	}
	

	@GetMapping("/product/bill")
	public double calculateBill()
	{
		System.out.println("Inside bill controller method");
		double totalBill =0;
		
		for(Map.Entry<String, Double> entry : products.entrySet() ) {
			
			String productID = entry.getKey();
			double price = entry.getValue();
			
			 totalBill += price;
		}
		System.out.println(totalBill);
		return totalBill;
	}
}
