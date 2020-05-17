package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long>{

}
