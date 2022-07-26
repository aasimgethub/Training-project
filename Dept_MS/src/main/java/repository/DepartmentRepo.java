package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import entity.Department;

public interface DepartmentRepo extends MongoRepository<Department,String> {

}
