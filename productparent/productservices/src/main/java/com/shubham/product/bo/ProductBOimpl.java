package com.shubham.product.bo;

import com.shubham.product.dao.ProductDAO;
import com.shubham.product.dao.ProductDAOimpl;
import com.shubham.product.dto.Product;

public class ProductBOimpl implements ProductBO {

	private static ProductDAO dao= new ProductDAOimpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
