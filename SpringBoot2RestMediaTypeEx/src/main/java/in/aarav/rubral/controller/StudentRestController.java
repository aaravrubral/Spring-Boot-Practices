package in.aarav.rubral.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aarav.rubral.model.Exam;
import in.aarav.rubral.model.ExamResult;
import in.aarav.rubral.model.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@GetMapping("/fetch")
	public Student getOneStudent() {
		
		return new Student(101,"Araha",450.0);
	}
	
	@GetMapping("/fetchall")
	public List<Student> getAllStudent(){
		
		return Arrays.asList(new Student(121, "Raja Babu", 5550.0),
				                           new Student(123,"Hari Krinsha",3324.0),
				                           new Student(124,"Natraj",4356.0),
				                           new Student(125,"Murgan Ashwin",8540.0),
				                           new Student(126, "Bala Babu", 3250.0),
				                           new Student(127,"Narayan Krinsha",3324.0),
				                           new Student(128,"Krinsha ",3156.0),
				                           new Student(129,"Kanhaiya ",7540.0)
				);
	}
	
	@GetMapping("/result")
	public ExamResult getStudentResult() {
		
		return new ExamResult(121, "Pass", "A+", 360, 
				                       Arrays.asList(
				                    		      new Exam("Maths" ," Pass",80),
				                    		      new Exam("Science" ," Pass",70),
				                    		      new Exam("Hindi" ," Pass",60),
				                    		      new Exam("English" ," Pass",90),
				                    		      new Exam("Social Science" ," Pass",60)
				                    		   ),
				getOneStudent());
	}
	
	@GetMapping("/info")
	public Map<String,Student> getStudentByCodes(){
		
		return Map.of(
				     "Ind-001-51200-UP", new Student(121, "Raja Babu", 5550.0),
				     "Ind-002-52000-MP", new Student(123, "Shiv Ji", 5350.0),
				     "Ind-003-53000-AP", new Student(124, "Rangnath Swamy", 2350.0)
				);
	}

}
