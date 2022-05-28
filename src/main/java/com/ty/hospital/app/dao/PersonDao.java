package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.Person;

public interface PersonDao {
	
	public Person savePerson(Person person);
	public Person getPersonById(int id);
	public List<Encounter> getPersonEncounterByPersonId(int id);
	public List<Person> getAllPerson();
	public Person updatePerson(Person person,int id);
	public boolean deletePerson(int id);

}
