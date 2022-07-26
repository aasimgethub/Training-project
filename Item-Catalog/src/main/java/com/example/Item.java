package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Item {
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	@Entity
	

	    public Item(String name) {
	        this.name = name;
	    }

	    @Id
	    @GeneratedValue
	    private Long id;

	    private String name;
	}

	@RepositoryRestResource
	interface ItemRepository extends JpaRepository<Item, Long> {}

	@Component
	class ItemInitializer implements CommandLineRunner {

	    private final ItemRepository ItemRepository;

	    ItemInitializer(ItemRepository itemRepository) {
	        this.itemRepository = itemRepository;
	    }

	    @Override
	    public void run(String... args) throws Exception {
	        Stream.of(""Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
	                .forEach(item -> itemRepository.save(new Item(item)));

	        itemRepository.findAll().forEach(System.out::println);
	    }
	}

