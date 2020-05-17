package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entity.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
