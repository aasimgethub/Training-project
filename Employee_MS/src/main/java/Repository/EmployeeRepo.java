package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Entity.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,Integer>{

}
