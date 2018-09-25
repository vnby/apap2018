package com.apap.tutorial3.service;

import java.util.List;

import com.apap.tutorial3.model.CarModel;

public interface CarService {
	void addCar(CarModel car);
	
	CarModel updateCar(String id, String amount);
	
	CarModel deleteCar(String id);
	
	List<CarModel> getCarList();
	
	CarModel getCarDetail(String id);
}
