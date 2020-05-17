package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Area;
import tn.esprit.spring.repository.AreaRepository;
import tn.esprit.spring.service.Impl.AreaServiceImpl;

@RestController
@RequestMapping("api/v1")
public class AreaController {
	
	@Autowired
	private AreaRepository areaRepository;
	@Autowired
	private AreaServiceImpl areaServiceImpl;
	
	@PostMapping("/save/area")
	public ResponseEntity<Area> save(@RequestBody Area area) {
		area=areaRepository.save(area);
		return new ResponseEntity<Area>(area,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/fetch/area/{cityId}")
	public ResponseEntity<List<Area>> fetch(@PathVariable Long cityId) {
		List<Area> area=areaServiceImpl.retrieve(cityId);
		return new ResponseEntity<List<Area>>(area,HttpStatus.ACCEPTED);
	}

}
