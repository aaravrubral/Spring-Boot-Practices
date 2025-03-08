package in.aarav.rubral.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Suv {

	private Integer suvId;
	private String suvName;
	private Double suvCost;
}
