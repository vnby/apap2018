package com.apap.tutorial3rabu.service;

import java.util.List;

import com.apap.tutorial3rabu.model.PilotModel;

public interface PilotService {
	void addPilot (PilotModel pilot);
	PilotModel updatePilot(String licenseNumber, Integer flyHour);
	PilotModel deletePilot(String id);
	List<PilotModel> getPilotList();
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
}
