package in.aarav.rubral.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engine")
public class EngineController {
	
	@GetMapping("/test/{code}")
	public String getEngineOne(
			               @PathVariable Integer code) {
		
		return "Data is "+code;
	}
	
	@GetMapping("/test/{name}")
	public String getEngineSecond(
			               @PathVariable String name) {
		
		return "Data is "+name;
	}

}
