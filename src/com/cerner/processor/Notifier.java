package com.cerner.processor;

import java.util.ArrayList;

import com.cerner.base.Address;
import com.cerner.base.Medication;
import com.cerner.business.Nurse;
import com.cerner.business.Patient;

public class Notifier {
	
	public static void main(String[] args) {
		ArrayList<Nurse> nurseList=new ArrayList<Nurse>();
		ArrayList<Patient> patientList=new ArrayList<Patient>();
		
		/* Creating 2 nurses and 3 patients and adding them to their respective lists*/
		Nurse nurse1=new Nurse();
		Nurse nurse2=new Nurse();
		
	/******************************Setting Nurses***************************************/
		nurse1.setName("Lora");
		nurse1.setlName("Denis");
		Address address1=new  Address();
		address1.setApartmentName("Arbor-Oaks");
		address1.setApartmentNumber(215);
		
		nurse2.setName("Lora");
		nurse2.setlName("Kenis");
		Address address2=new  Address();
		address2.setApartmentName("Meadow-Run");
		address2.setApartmentNumber(234);
		
		
	/************************************Setting patient*************************************/	
		Patient patient1=new Patient();
		patient1.setName("Mr X");
		patient1.setlName("Xian");
		Address address3=new Address();
		address3.setApartmentName("Y");
		address3.setApartmentNumber(300);
		
		Medication m1=new Medication();
		m1.setAlergic(true);
		m1.setFrequency("Hour");
		m1.setMedicineClass("Drug-C");
		m1.setMedicineName("Diclofenac");
		
		
		Medication m2=new Medication();
		m2.setAlergic(true);
		m2.setFrequency("Four Hour");
		m2.setMedicineClass("Drug-X");
		m2.setMedicineName("Diclfgofenac");
		
		
		Medication m3=new Medication();
		m3.setAlergic(true);
		m3.setFrequency("Weekly");
		m3.setMedicineClass("Drug-Z");
		m3.setMedicineName("Diclofedsfggsnac");
		
		
		ArrayList<Medication> medicationList=new ArrayList<Medication>();
		medicationList.add(m1);
		medicationList.add(m2);
		medicationList.add(m3);
		
		patient1.setMedicationList(medicationList);
	/**************************************************************************************/	
		
		
		
	}
	
	
}
