package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Location;

import repository.LocationRepo;

@RestController
public class LocationController {

	private LocationRepo repo;
	
	public String addLoc(@RequestBody Location loc) {
		repo.save(loc);
		return "Location data Added Succeessfully";
	}
	@GetMapping("/findAllLoc")
	public List<Location> getLoc(){
		return repo.findAll();
	}
	
	public String deleteLoc(@PathVariable String LocId) {
		repo.deleteById(LocId);
		return "Deleted Successfully";
	}
}
