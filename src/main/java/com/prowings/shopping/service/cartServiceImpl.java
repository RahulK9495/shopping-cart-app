package com.prowings.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.shopping.model.dto.CartDto;
import com.prowings.shopping.model.dto.ProductDto;
import com.prowings.shopping.model.source.Product;


@Service
public class cartServiceImpl implements cartService {
	
	@Autowired
	productService pservice;

	@Override
	public ResponseEntity<ProductDto> addProductItemTocart(int id) {

		ResponseEntity<ProductDto> fetchedProduct = pservice.getProductById(id);
		

		return fetchedProduct;
	}

	
}
