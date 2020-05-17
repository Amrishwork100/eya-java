package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.PropertyDetails;
import tn.esprit.spring.repository.PropertyDetailsRepository;

@RestController
@RequestMapping("api/v1")
public class PropertyDetailsController {
	
	@Autowired
	private PropertyDetailsRepository propertyDetailsRepository;
	
	@PostMapping("/save/propertydetails")
	public ResponseEntity<PropertyDetails> save(@RequestBody PropertyDetails propertyDetails){
		propertyDetails=propertyDetailsRepository.save(propertyDetails);
		return new ResponseEntity<PropertyDetails>(propertyDetails,HttpStatus.ACCEPTED);
	}

}
