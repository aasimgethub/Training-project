package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list=List.of(
			new Contact(1L,"aasim@gmail.com","Aasim",1311L),
			new Contact(2L,"qasim@gmail.com","Qasim",1312L),
			new Contact(3L,"shaikh@gmail.com","shaikh",1313L),
			new Contact(4L,"sohail@gmail.com","sohail",1314L)

			);
	
	

	@Override
	public List<Contact> getContactsOfUser(Long UserId) {
		
		return list.stream().filter(contact ->contact.getUserId().equals(UserId)).collect(Collectors.toList());
	}
}
