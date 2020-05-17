package tn.esprit.spring.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Area;
import tn.esprit.spring.entity.City;
import tn.esprit.spring.repository.AreaRepository;
import tn.esprit.spring.repository.CityRepository;

@Service
public class AreaServiceImpl {

	@Autowired
	private AreaRepository areaRepository;
	@Autowired
	private CityRepository cityRepository;
	private List<Area> filtered = new ArrayList<Area>();

	public List<Area> retrieve(Long id) {
		Optional<City> optionalCity = cityRepository.findById(id);
		City newCity = optionalCity.get();
		List<Area> area = areaRepository.findAll();
		for (Area ar : area) {
			if (ar.getCityReferenceCode().equals(newCity.getCityCode())) {
				filtered.add(ar);
			}
		}
		return filtered;

	}

}
