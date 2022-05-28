package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.Encounter;

public interface BranchDao {
	
	public Branch saveBranch(Branch branch, int hospital_id);
	public Branch getBranchById(int id);
	public Branch getBranchHospitalById(int id);
	public List<Branch> getAllBranch();
	public List<Branch>getHospitalBranches(int hospital_id);
	public Encounter getBranchEncounters(int branch_id);
	public Branch updateBranch(Branch branch, int id);
	public boolean deleteBranchById(int id);
	

}
