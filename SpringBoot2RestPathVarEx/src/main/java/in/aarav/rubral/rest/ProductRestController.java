package in.aarav.rubral.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	/**
	 * {path} and @PathVariable data type path
	 * Here Path must be matching
	 * 
	 */
	@GetMapping("/fetch/{code}")
	public String getOneProduct(
			                @PathVariable String code) {
		
		return "Data is "+ code;
	}
	
	/**
	 * Must pass id and code in same order
	 * 
	 * 
	 */
	
	@GetMapping("/get/{id}/{code}")
	public String getDescProduct(
			               @PathVariable Integer id,
			               @PathVariable String code) {
		
		return " Product id is "+id+" and Product code is "+code;
	}

}
