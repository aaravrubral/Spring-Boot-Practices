package in.aarav.rubral.model;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Integer pid;
	private String pcode;
	private String pname;
	private Double pcost;
	
	private List<Vendors> vendor;
	
	//private Set<String> colors;
	
}
