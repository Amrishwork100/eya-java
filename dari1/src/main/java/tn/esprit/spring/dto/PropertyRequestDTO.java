package tn.esprit.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PropertyRequestDTO {
	
	private String areaCode;
	private String cityCode;
	private float minArea;
	private float maxArea;
	private float maxPrice;
	private float miniPrice;

}
