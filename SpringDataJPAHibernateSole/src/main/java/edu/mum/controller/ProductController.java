package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.Phone;
import edu.mum.domain.Product;
import edu.mum.service.PhoneService;
import edu.mum.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	PhoneService phoneService;

	@RequestMapping(value = { "/product" }, method = RequestMethod.GET)
	public String inputProduct() {
		return "ProductForm";
	}

	// bidirectional -- cascade from parent to child
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String saveProduct(Product product) {

		// ....Demo Cascade
		// Best practice on bidirectional set BOTH ends ["Pretend" no DB]
		product.getHotLine().setProduct(product);
		product = productService.save(product); // insert & [ insert OR Update of phone]

		return "ProductDetails";
	}

	@RequestMapping(value = "/listproducts", method = RequestMethod.GET)
	public String listProducts(Product product, Model model) {

		List<Product> list = productService.getAllProducts();
		model.addAttribute("products", list);

		return "ListProducts";
	}

	// bidirectional -- cascade from child to parent
	@RequestMapping(value = "/addPhone", method = RequestMethod.GET)
	public String addPhone(Model model) {

		Phone phone = new Phone();
		phone.setAreacode(123);
		phone.setNumber(2367);
		phone.setPrefix(222);

		Product product = new Product();
		product.setName("TestPhone");
		product.setDescription("Test SAVE Phone");
		product.setPrice((float) 44.00);

		// Good OO - set both sides
		phone.setProduct(product);
		product.setHotLine(phone);

		phoneService.save(phone);

		model.addAttribute("product", product);

		return "ProductDetails";
	}

}
