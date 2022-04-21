package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.entity.Bike;
import com.tutorial.repository.BikeRepository;


@Service
public class BikeService {

	@Autowired
	BikeRepository bikeRepository;
	
	public List<Bike> getAllBikes(){
		return bikeRepository.findAll();
	}
	
	public Bike getBikeById(int id) {
		return bikeRepository.findById(id).orElse(null);//Porque puede retornar null
	}
	
	public Bike save(Bike bike) {
		Bike bikeNew = bikeRepository.save(bike);
		return bikeNew;
	}
	public List<Bike> findByUserId(int userId){
		return bikeRepository.findByUserId(userId);
	}
}
