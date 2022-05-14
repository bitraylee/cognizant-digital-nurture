package com.shubham.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shubham.product.dto.Product;

public class ProductDAOimplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao=new ProductDAOimpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Something");
		product.setDescription("Its great");
		product.setPrice(500);
		
		dao.create(product);
		
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Something", result.getName());
	}

}
