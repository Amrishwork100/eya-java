package tn.esprit.spring.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.PropertyDetails;
import tn.esprit.spring.repository.AreaRepository;
import tn.esprit.spring.repository.CityRepository;
import tn.esprit.spring.repository.PropertyDetailsRepository;

@Service
public class PropertySearchServiceImpl {

	@Autowired
	private PropertyDetailsRepository propertyDetailsRepository;

	@Autowired
	private AreaRepository areaRepository;

	@Autowired
	private CityRepository cityRepository;

	public List<PropertyDetails> fetchPropertyDetails(long cityId, long areaId, double maxPrice, double miniPrice) {
		List<PropertyDetails> prop = propertyDetailsRepository.findAll();
		List<PropertyDetails> filtered = new ArrayList<PropertyDetails>();
		if (prop.size() != 0) {
			for (PropertyDetails pd : prop) {
				if (cityRepository.getOne(cityId).getCityCode().equals(pd.getCityreferenceCode())) {
					if (areaRepository.getOne(areaId).getAreaCode().equals(pd.getAreaReferenceCode())) {
						if (pd.getPrice() <= maxPrice && pd.getPrice() >= miniPrice) {
							filtered.add(pd);

						}
					}
				}

			}

		}
		return filtered;

	}

}
