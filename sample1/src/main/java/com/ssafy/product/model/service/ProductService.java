package com.ssafy.product.model.service;

import java.util.List;

import com.ssafy.product.model.ProductDto;

public interface ProductService {

	public List<ProductDto> listProduct() throws Exception;
	
}
