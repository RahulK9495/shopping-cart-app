package com.prowings.shopping.service;

import org.springframework.http.ResponseEntity;

import com.prowings.shopping.model.dto.ProductDto;
import com.prowings.shopping.model.source.Product;

public interface cartService {

	public ResponseEntity<ProductDto> addProductItemTocart(int id);
}
