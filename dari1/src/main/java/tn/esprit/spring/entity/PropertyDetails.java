package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="property_deatails")
public class PropertyDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long propertyDetailsId;
	private String name;
	private String type;
	private String address;
	private String areaReferenceCode;
	private String cityreferenceCode;
	private long pin;
	private double price;
	private String plotSize;
	private String landmark;
	
	
	

}
