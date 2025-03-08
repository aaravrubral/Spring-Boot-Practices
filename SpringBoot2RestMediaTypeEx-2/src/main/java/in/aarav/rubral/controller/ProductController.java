package in.aarav.rubral.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.model.Color;
import in.aarav.rubral.model.Product;
import in.aarav.rubral.model.Vendors;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/fetch")
	public Product getProduct() {
		
		return new Product(5001,"PD-101" ,"Server-API", 400.89, 
				getVendor()
				);
	}
	
	@GetMapping("/vendor")
	public List<Vendors> getVendor() {
		return Arrays.asList(
				              new Vendors(102, "NTT Data", 1050.50),
				              new Vendors(103, "Infosys", 2050.60),
				              new Vendors(104, "TCS", 3050.10),
				              new Vendors(105, "Cognizant", 4050.20),
				              new Vendors(106, "Accenture", 5050.30)
				);
	}
	
	@GetMapping("/color")
   public Map<String,Color> getColors(){
	   
	   return Map.of("IND-101",new Color(123,"RED"),
			                   "IND-102",new Color(122,"Blue"),
			                   "IND-103",new Color(124,"Black"),
			                   "IND-104",new Color(125,"Green"),
			                   "IND-105",new Color(126,"Violet")
			   );
   }

}
