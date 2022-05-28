package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Observation;

public interface ObservationDao {
	
	public Observation createObservation(Observation observation, int id);
	public Observation getObservation(int id);
	public List<Observation> getObservationByEncounterId(int encounter_id);
	public Observation updateObservation(Observation observation, int id);
	public boolean deleteObservation(int id);

}
