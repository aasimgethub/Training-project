package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Employee;
import Repository.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/addEmp")
	public String saveEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return "Employee data Added successfully";
		
	}
	
	@GetMapping("/findAllEmp")
	public List<Employee> getEmp(){
		return repo.findAll();
	}
	 @DeleteMapping("/delete/{id}")
	    public String deleteEmp(@PathVariable int id){
	        repo.deleteById(id);
	        
	        return "Deleted Successfully";
	    }
}
