package in.aarav.rubral.rest;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.model.Engine;
import in.aarav.rubral.model.Suv;
import in.aarav.rubral.model.Vehicle;

@RestController
@RequestMapping("/vehicle")
public class VehicalRestController {

	@GetMapping("/details")
	public Vehicle getOneVehicleDetails() {
		return new Vehicle("Mahindra-SUV-800", 800, "Hero-Splender", 110,2345210.0,
				                        Arrays.asList(new Engine(1100,"1230HP",23450.9),
				                        		new Engine(1200,"1530HP",33450.9)) ,
				                         new Suv(800,"Super-Power",43598.0));
	}
}
