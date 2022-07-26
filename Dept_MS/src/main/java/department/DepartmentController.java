package department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import entity.Department;
import repository.DepartmentRepo;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentRepo repo;
	
	@PostMapping("/addDept")
	public String saveDept(@RequestBody Department dept) {
		repo.save(dept);
		return "Data Added";
		
	}
	@GetMapping("/findAllEmp")
	public List<Department> getDept(){
		return repo.findAll();
	}
	
	public String deleteDept(@PathVariable String deptid) {
		repo.deleteById(deptid);
		return "Deleted Successfully";
	}
}
