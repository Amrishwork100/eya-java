package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.City;
import tn.esprit.spring.repository.CityRepository;

//@CrossOrigin("http://127.0.0.1:8080")
//@CrossOrigin("http://192.168.120.187:8080")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1")
public class CityController {
	
	@Autowired
	private CityRepository cityRepository;
	
	
	@PostMapping("/save/city")
	public ResponseEntity<City> save(@RequestBody City city) {
		city=cityRepository.save(city);
		return new ResponseEntity<City>(city,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/fetch/city")
	public ResponseEntity<List<City>> fetch() {
		List<City> city=cityRepository.findAll();
		return new ResponseEntity<List<City>>(city,HttpStatus.ACCEPTED);
	}

}
