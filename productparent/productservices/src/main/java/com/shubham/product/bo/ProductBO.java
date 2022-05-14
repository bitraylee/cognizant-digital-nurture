package com.shubham.product.bo;

import com.shubham.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);
	
	

}
