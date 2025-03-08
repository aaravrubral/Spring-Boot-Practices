package in.aarav.rubral.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.model.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@GetMapping("/fetch")
	public Student getOneStudent() {
		return new Student(101,"AA",200.0);
	}
}
