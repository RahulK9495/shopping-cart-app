package com.prowings.shopping.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.shopping.model.dto.CartDto;
import com.prowings.shopping.model.dto.ProductDto;
import com.prowings.shopping.model.source.Product;

@Service
public class productService {


	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	DozerBeanMapper beanMapper;
	
	public ResponseEntity<ProductDto> getProductById(int id) {

		ResponseEntity<Product> fetchedProduct = restTemplate.getForEntity("/products/"+id, Product.class);
		System.out.println(fetchedProduct);
		Product newProduct = fetchedProduct.getBody();
		ProductDto transProduct = beanMapper.map(newProduct, ProductDto.class);
		
		
		System.out.println(transProduct);

		
		return new ResponseEntity<ProductDto>(transProduct , HttpStatus.OK) ;
	}

}
