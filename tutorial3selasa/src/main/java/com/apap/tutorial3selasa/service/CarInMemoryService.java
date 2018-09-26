package com.apap.tutorial3selasa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3selasa.model.CarModel;

@Service
public class CarInMemoryService implements CarService {
	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
	}

	@Override
	public List<CarModel> getCarList() {
		return archiveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		for(int i = 0; i < archiveCar.size(); i++) {
			if(archiveCar.get(i).getId().equals(id)) {
				return archiveCar.get(i);
			}
		}
		return null;
	}

	@Override
	public CarModel updateCar(String id, String amount) {
		for(int i = 0; i < archiveCar.size(); i++) {
			if(archiveCar.get(i).getId().equals(id)) {
				archiveCar.get(i).setAmount(Integer.parseInt(amount));
				return archiveCar.get(i);
			}
		}
		return null;
	}

	@Override
	public CarModel deleteCar(String id) {
		for(int i = 0; i < archiveCar.size(); i++) {
			if(archiveCar.get(i).getId().equals(id)) {
				CarModel temp = archiveCar.get(i);
				archiveCar.remove(i);
				return temp;
			}
		}
		return null;
	}
}
