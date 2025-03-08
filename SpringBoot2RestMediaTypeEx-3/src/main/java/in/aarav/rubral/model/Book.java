package in.aarav.rubral.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookCost;
	
	private List<String> authors;
	private Map<String,String> versions;
	
	public Authors publishers;

}
