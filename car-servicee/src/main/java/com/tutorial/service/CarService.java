package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.entity.Car;
import com.tutorial.repository.CarRepository;


@Service
public class CarService {

	@Autowired
	CarRepository carRepository;
	
	public List<Car> getAllCars(){
		return carRepository.findAll();
	}
	
	public Car getCarById(int id) {
		return carRepository.findById(id).orElse(null);//Porque puede retornar null
	}
	
	public Car save(Car car) {
		Car carNew = carRepository.save(car);
		return carNew;
	}
	public List<Car> findByUserId(int userId){
		return carRepository.findByUserId(userId);
	}
}
