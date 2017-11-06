package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.domain.Product;
import edu.mum.repository.ProductRepository;
import edu.mum.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
  	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll();
	}
	
  	public List<Product> getAllProducts() {
  		// Does Join
// 		return productRepository.getAllProducts();
 		return (List<Product>) productRepository.findAll();
	}
	
	public Product save(Product product) {
		
		return productRepository.save(product);
	}
	
	
	public Product find(Long id) {
		return productRepository.findOne(id);
	 
	}
	
	
		   
}
 
