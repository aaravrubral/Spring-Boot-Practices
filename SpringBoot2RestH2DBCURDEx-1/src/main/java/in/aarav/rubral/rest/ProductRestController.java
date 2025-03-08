package in.aarav.rubral.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.entities.Product;
import in.aarav.rubral.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	// 1. Create a Product
	
	@GetMapping("/save")
	public ResponseEntity<String> createProduct(
			                                @RequestBody Product prodct){
		
		ResponseEntity<String> resp =null;
		Integer id = service.saveProduct(prodct);
		resp = new ResponseEntity<String>(
				             "Product ' "+id+" ' created", 
				              HttpStatus.CREATED);
		
		return resp;
	}
}
