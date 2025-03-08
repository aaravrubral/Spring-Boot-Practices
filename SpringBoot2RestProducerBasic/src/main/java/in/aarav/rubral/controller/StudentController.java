package in.aarav.rubral.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class StudentController {

	@PostMapping("/save")
	public String createStudent() {
		
		return "Student-Post";
	}
	
	@GetMapping("/show")
	public String fetchStudent() {
		return "Student-Get";
	}
	
	@PutMapping("/modify")
	public String updateStudent() {
		return "Student-Update";
	}
	
	@DeleteMapping("/remove")
	public String removeStudent() {
		return "Delete-Student";
	}
	
	@PatchMapping("/modifyEmail")
	public String updateStudentEmail() {
		return "Student-PartialUpdate";
	}
}
