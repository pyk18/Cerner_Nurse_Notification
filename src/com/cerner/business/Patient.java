package com.cerner.business;


import java.util.ArrayList;

import com.cerner.base.Medication;
import com.cerner.base.Person;

public class Patient extends Person {

	private ArrayList<Medication> medicationList=new ArrayList<Medication>();

	public ArrayList<Medication> getMedicationList() {
		return medicationList;
	}

	public void setMedicationList(ArrayList<Medication> medicationList) {
		this.medicationList = medicationList;
	}
	
}
