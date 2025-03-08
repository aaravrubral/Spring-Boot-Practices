package in.aarav.rubral.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.entities.Product;
import in.aarav.rubral.exception.ProductNotFoundException;
import in.aarav.rubral.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;
	
	// 1. Create a Product
	
	@PostMapping("/save")
	public ResponseEntity<String> createProduct(
			                                @RequestBody Product prodct){
		
		ResponseEntity<String> resp =null;
		
		Integer id = service.saveProduct(prodct);
		resp = new ResponseEntity<String>(
				             "Product ' "+id+" ' created", 
				              HttpStatus.CREATED);
		
		return resp;
	}
	
	// View all products
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct(){
		
		ResponseEntity<List<Product>> resp = null;
		List<Product> list = service.findAllProducts();
		resp = new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		
		return resp;
	}
	
	/* 3.  find one Product by id
	 * Using PathVariable to get local variable
	 */
	@GetMapping("/find/{id}")
	public ResponseEntity<?> fetchOneProduct(
			                                          @PathVariable Integer id){
		
		ResponseEntity<?> resp = null;
         try {
        	 
        	 Product p = service.findOneProduct(id);
        	 resp = new ResponseEntity<Product>(p, HttpStatus.OK);
        	 
		  } catch (ProductNotFoundException e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					            e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
		
		return resp;
	}
	
	/* Delete one product by id
	 * throw exception if not found through service layer
	 */
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeOneProduct(
			                                           @PathVariable Integer id){
		ResponseEntity<String> resp=null;
		
		try {
			service.deleteProduct(id);
			resp = new ResponseEntity<String>(id+" - Product Is deleted",
					                               HttpStatus.OK);
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			resp= new  ResponseEntity<String>(
					        e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return resp;
	}
}
