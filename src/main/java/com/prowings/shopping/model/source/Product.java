package com.prowings.shopping.model.source;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

	public Long id;

	public String name;

	public String description;	

	public double price;	

	public String category;
}
