package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Hospital;

public interface HospitalDao {
	
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospitalById(int id);
	public Hospital getHospitalBranchesById(int id);
	public List<Hospital> getAllHospital();
	public Hospital updateHospital(Hospital hospital, int id);
	public boolean deleteHospitalById(int id);

}
