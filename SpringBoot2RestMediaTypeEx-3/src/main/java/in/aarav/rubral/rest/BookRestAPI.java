package in.aarav.rubral.rest;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.model.Book;



@RestController
@RequestMapping("/book")
public class BookRestAPI {
	
	@PostMapping("save")
	public String createBook(
		@RequestBody	Book book) {
	
		return book.toString();
	}

}
