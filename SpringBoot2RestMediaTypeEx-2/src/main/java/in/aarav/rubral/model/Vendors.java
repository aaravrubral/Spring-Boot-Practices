package in.aarav.rubral.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendors {
	
	private Integer vid;
	private String vname;
	private Double vcharge;

}
