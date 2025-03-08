package in.aarav.rubral.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.entity.Product;
import in.aarav.rubral.exception.ProductNotFoundException;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findOneProduct( 
			                             @PathVariable Integer id){
		
		ResponseEntity<?> resp=null;
		
		try {
			if(id>10)
			resp = new ResponseEntity<Product>(new Product(101, "Furniture101", 23412.0), 
					                                                         HttpStatus.CREATED);
			else
				throw new ProductNotFoundException("Not Found Any Product");
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>("Error is"+ e.getMessage() , 
                    HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return resp;
	}

}
