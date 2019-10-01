package com.example.practicaljava.rest.service;

import java.util.List;

import com.example.practicaljava.rest.domain.Car;

public interface CarService {
	
	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "Black", "White");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV");
	
	Car generateCar();

}
