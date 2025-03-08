package in.aarav.rubral.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

	private String car;
	private Integer carno;
	private String bike;
	private Integer bikeno;
	private Double vcost;
	
	private List<Engine> engine;
	
	private Suv suv;
}
