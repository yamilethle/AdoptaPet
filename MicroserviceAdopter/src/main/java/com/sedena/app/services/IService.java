package com.sedena.app.services;

import java.util.List;

import com.sedena.app.entities.Adopter;


public interface IService {
	boolean insert(Adopter a);
	List<Adopter> findAll();
	Adopter findById(long id);
	Adopter findByEmail(String email);
	List<Adopter> findByLastName(String lastName);
	boolean update(Adopter a);
	boolean deleteById(long id);
	

}