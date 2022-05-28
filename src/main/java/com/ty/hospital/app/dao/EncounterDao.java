package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Encounter;

public interface EncounterDao {
	
	public Encounter createEncounter(int branch_id, int person_id, Encounter encounter);
	public Encounter getEncounterById(int id);
	public List<Encounter> getEncounterByBranchId(int branch_id);
	public List<Encounter> getEncounterByPersonId(int person_id);
	public Encounter updateEncounter(Encounter encounter, int id);
	public boolean deleteEncounterById(int id);
	

}
