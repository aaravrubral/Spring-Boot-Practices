package in.aarav.rubral.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Student {

	@GetMapping("/save")
	public String login() {
		return "Hi You are Successfully Logged in";
	}
}
