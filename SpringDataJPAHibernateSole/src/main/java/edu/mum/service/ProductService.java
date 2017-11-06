package edu.mum.service;

import java.util.List;

import edu.mum.domain.Product;

public interface ProductService {

	public List<Product> getAll();

	public List<Product> getAllProducts();

	public Product save(Product product);

	public Product find(Long id);

}
