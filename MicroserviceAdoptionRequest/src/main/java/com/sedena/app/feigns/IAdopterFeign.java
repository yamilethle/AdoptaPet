package com.sedena.app.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sedena.app.entities.Adopter;

//before eureka
//@FeignClient(name="microserviceadopter", url = "http://localhost:9092")

//after eureka, name aplication properties del microservicio 
@FeignClient(name="microserviceadopter")
public interface IAdopterFeign {
	
	@GetMapping("/adopter/id/{id}")
	Adopter findById(@PathVariable("id") long id);

}
