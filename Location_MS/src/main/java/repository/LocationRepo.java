package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Entity.Location;

public interface LocationRepo extends MongoRepository<Location,String>{

}
