package com.example.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/product")
public class productcontroller {
	@Autowired
	private PersonService productService;
	@GetMapping(path="/save")
	public String getPservice() {
	return "Dignesh";
}


public void setPservice(PersonService pservice) {
	this.productService = productService;
}
}
