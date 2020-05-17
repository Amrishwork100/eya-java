package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.PropertyDetails;
import tn.esprit.spring.service.Impl.PropertySearchServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1")
public class PropertySearchController {

	@Autowired
	private PropertySearchServiceImpl propertySearchServiceImpl;

	// PropertyRequestDTO

	@GetMapping("/fetch/propertylist/{cityId}/{areaId}/{maxPrice}/{miniPrice}")
	public ResponseEntity<List<PropertyDetails>> retrievePropertyDeatils(@PathVariable long cityId,
			@PathVariable long areaId, @PathVariable double maxPrice, @PathVariable double miniPrice) {

		List<PropertyDetails> propertylist = propertySearchServiceImpl.fetchPropertyDetails(cityId, areaId,
				maxPrice, miniPrice);
		return new ResponseEntity<List<PropertyDetails>>(propertylist, HttpStatus.OK);

	}

}
