package com.jwt.auth.jwttutorial.dto;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutletDTO {


	private UUID id;

	private String name;

	@JsonProperty("brand_name")
	private String brandName;
	

	private LocationDTO location;

}