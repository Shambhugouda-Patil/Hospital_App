package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.MedOrder;

public interface MedOrderDao {
	
	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id);
	public MedOrder getMedOrderById(int id);
	public List<MedOrder> getMedOrderByEncounterId(int encounter_id);
	public MedOrder updateMedOrder(MedOrder medOrder, int id);
	public List<MedOrder> getMedOrderByPersonId(int person_id);
	public boolean deleteMedOrder(int id);
	

}
